package com.lenner.springManualDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Developer {

//	@Value("21")
	int hoursCoding ;
	
	public Developer(){
//		System.out.println("Developer Created");
	}
	public void doCode() {
		System.out.println("CODING!!13");
	}
}
