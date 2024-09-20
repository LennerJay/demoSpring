package com.lenner.springManualDemo;

public class DriverService {
	private Driver driver;
	
	
//	
//	public DriverService(Driver driver) {
//		super();
//		this.driver = driver;
//	}

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
