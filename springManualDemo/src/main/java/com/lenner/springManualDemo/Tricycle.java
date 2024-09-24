package com.lenner.springManualDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



//@Scope
@Component("tricycle")
@Primary
public class Tricycle implements Driver {
	
	
    public Tricycle() {
    
    }
	;

	@Override
	public void drive() {
		System.out.println("Driving using Tricylce");
		
	}




}
