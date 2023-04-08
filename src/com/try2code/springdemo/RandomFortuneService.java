package com.try2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "Random Service";
	}
	

}
