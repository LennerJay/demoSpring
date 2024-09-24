package com.lenner.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javafx.application.Application;

@SpringBootApplication
public class SpringFirstDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=  SpringApplication.run(SpringFirstDemoApplication.class, args);
	
		Alien ojb = context.getBean(Alien.class);
		ojb.code();
		
//		Laptop laptop = context.getBean(Laptop.class);
//		laptop.coding();
	}

}
