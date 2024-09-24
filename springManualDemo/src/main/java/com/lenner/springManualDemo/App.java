package com.lenner.springManualDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lenner.springManualDemo.Config.AppConfig;


public class App 
{	
    public static void main( String[] args )
    {


//        using Bean Configuration
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Developer dev = context.getBean(Developer.class);
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
        	
//        	DriverService  ds = context.getBean("driverService",DriverService.class);
//        	ds.drive();
//        
//        using Java Base Configuration
  	  	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
  	  	DriverService sd = context.getBean(DriverService.class);
    	sd.drive();
//        
//        Developer dev = context.getBean(Developer.class);
//        dev.hoursCoding = 21;
//        dev.doCode();
//        System.out.println(dev.hoursCoding);
//        
//        Developer dev2 = context.getBean(Developer.class);
//        System.out.println(dev2.hoursCoding);]
//  	  
//  	  	Person p = context.getBean(Person.class);
//  	  	p.startCoding();
    }
}
