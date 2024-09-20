package com.lenner.springManualDemo;

public class Person {
	private int age;
	private Developer dev;

	public Developer getDev() {
		return dev;
	}
	public Person(int age, Developer dev) {
		System.out.println("Person Created");
		this.age = age;
		this.dev = dev;
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
