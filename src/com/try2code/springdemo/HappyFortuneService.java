package com.try2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService  implements FortuneService{
	
	public HappyFortuneService() {
		
		System.out.println("first");
	}

	@Override
	public String getFortune() {
		return "let's play today" ; 
	}

}
