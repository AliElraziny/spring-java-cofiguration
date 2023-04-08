package com.try2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.try2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	@Bean
	public Coach footballCoach() {
		
		FootballCoach myFootballCoach = new FootballCoach();
		
		return myFootballCoach ; 
		
	}

	
	
}
