package com.cheer.annotation.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	
	@Autowired
	private Engine engine;
	@Autowired
	private GearBox gearBox;
	@Autowired
	private Wheel wheel;
	@Value("奥迪")
	private String brand;
	@Value("RS")
	private String model;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public GearBox getGearBox() {
		return gearBox;
	}

	public void setGearBox(GearBox gearBox) {
		this.gearBox = gearBox;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
