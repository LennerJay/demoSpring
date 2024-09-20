package com.lenner.springManualDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Developer dev = context.getBean(Developer.class);

//        dev.doCode();
//        dev.hoursCoding = 2;
//        System.out.println(dev.hoursCoding);
//        
//        
//        Developer dev1 = (Developer) context.getBean("developer");
//        dev.doCode();
//        System.out.println(dev1.hoursCoding);
        
//        Person p = (Person) context.getBean("person");
        
//        System.out.println(p.getAge());
//        p.startCoding();
        	
        	DriverService  ds = context.getBean("driverService",DriverService.class);
        	ds.drive();
        	
    }
}
