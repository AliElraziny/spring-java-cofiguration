package com.try2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeAppDemo {

	public static void main(String[] args) {

		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		FootballCoach coach = context.getBean("footballCoach", FootballCoach.class);
		
		Coach anotherCoach = context.getBean("footballCoach", FootballCoach.class);
		
		
		boolean rslt = (coach==anotherCoach);
		System.out.println(rslt);
		System.out.println(coach.getDailyWorkout());
		System.out.println(anotherCoach.getDailyWorkout());
		System.out.println(coach.getEmail());
		
		context.close();
	}

}
