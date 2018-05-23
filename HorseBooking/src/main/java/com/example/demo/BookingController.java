package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {
	private HorseRepository horseRepository;
	
	@Autowired
	public BookingController(HorseRepository horseRepository) {
		this.horseRepository = horseRepository;
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<HorseBooking> getAll(){
		return horseRepository.findAll();
	}
	
	public HorseBooking getHorses(@PathVariable Long id){
        return horseRepository.getOne(id);   }
	@RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<HorseBooking> create(@RequestBody HorseBooking horseBooking) {
		horseRepository.save(horseBooking);
        return horseRepository.findAll();
    }
	
	
	
}
