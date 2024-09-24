package com.lenner.springManualDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DriverService {
	
	@Autowired
	@Qualifier("bus")
	private Driver driver;
	
	
	
	public DriverService(Driver driver) {
		super();
		this.driver = driver;
	}

	public Driver getDriver() {
		return driver;
	}
	

	public void setDriver(Driver driver) {
		this.driver = driver;
	}


	
	public void drive() {

		driver.drive();
	}
	
}
