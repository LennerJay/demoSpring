package com.lenner.springManualDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private int age;
	@Autowired
	private Developer dev;

	
	 public Person(int age, Developer dev) {
 
		this.age = age;
		this.dev = dev;
	}
	public Person() {
		System.out.println("Person Created123");
	}
	
	
	public Developer getDev() {
	 	return dev;
	}

	public void setDev(Developer dev) {
		this.dev = dev;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) { 
		this.age = age;
	}


	public void startCoding() {
 		 dev.doCode();
	}
}
