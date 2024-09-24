package com.lenner.springManualDemo.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

//import com.lenner.springManualDemo.*;
//import com.lenner.springManualDemo.Developer;
//import com.lenner.springManualDemo.DriverService;

@Configuration
@ComponentScan("com.lenner.springManualDemo")
public class AppConfig {
	
//	@Bean
////	@Scope("prototype")
//	public Developer developer() {
//		return new Developer();
//	}
////	@Bean(name ="ds") or (name={"d1","d2"})
//	@Bean
////	public DriverService driverService(@Qualifier("bus") Driver driver)
//	public DriverService driverService( Driver driver) {
//		return new DriverService(driver);
//	}
////	@Bean
////	public Person person () {
////		return new Person();
////	}
//	@Bean
//
//	public Tricycle tricyle() {
//		return new Tricycle();
//	}
//	@Bean
//	@Primary
//	public Bus bus() {
//		return new Bus();
//	}
}

