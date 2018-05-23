package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder implements CommandLineRunner{
	private HorseRepository horseRepository;
	@Autowired
	public DatabaseSeeder(HorseRepository horseRepository) {
		this.horseRepository = horseRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		List<HorseBooking> bookings = new ArrayList<>();
		bookings.add(new HorseBooking("Ghost", "American Horse", "Male", 5, 50, "Brown", "White", 1000, 1 , 1 , 1 , 1));
		bookings.add(new HorseBooking("Viper", "American Horse", "Female", 6, 50, "Brown", "White", 1001, 1 , 2 , 2 , 1));
		
		horseRepository.saveAll(bookings);
	}

}
