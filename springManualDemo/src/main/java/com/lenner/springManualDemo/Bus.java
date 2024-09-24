package com.lenner.springManualDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bus")
public class Bus implements Driver {

	@Override
	public void drive() {
		System.out.println("Driving using Bus");

	}

}
