package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HorseBooking {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String horseName;
	private String Breed;
	private String Sex;
	private int Age;
	private int Weight;
	private String Color;
	private String Markings;
	private int RegistrationNumber;
	private int Vet_id;
	private int Owner1_id;
	private int Owner2_id;
	private int Stable_id;
	
	public HorseBooking() {}
	
	public HorseBooking(String horseName, String breed, String sex, int age, int weight, String color, String markings,
			int registrationNumber, int vet_id, int owner1_id, int owner2_id, int stable_id) {
		super();
		this.horseName = horseName;
		Breed = breed;
		Sex = sex;
		Age = age;
		Weight = weight;
		Color = color;
		Markings = markings;
		RegistrationNumber = registrationNumber;
		Vet_id = vet_id;
		Owner1_id = owner1_id;
		Owner2_id = owner2_id;
		Stable_id = stable_id;
	}
	
	public Long getId() {
		return id;
	}

	public String getHorseName() {
		return horseName;
	}

	public String getBreed() {
		return Breed;
	}

	public String getSex() {
		return Sex;
	}

	public int getAge() {
		return Age;
	}

	public int getWeight() {
		return Weight;
	}

	public String getColor() {
		return Color;
	}

	public String getMarkings() {
		return Markings;
	}

	public int getRegistrationNumber() {
		return RegistrationNumber;
	}

	public int getVet_id() {
		return Vet_id;
	}

	public int getOwner1_id() {
		return Owner1_id;
	}

	public int getOwner2_id() {
		return Owner2_id;
	}

	public int getStable_id() {
		return Stable_id;
	}
	
}
