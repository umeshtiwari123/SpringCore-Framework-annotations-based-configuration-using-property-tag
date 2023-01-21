package com.telusko.telusko_annotations_based_config;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	public void drive()
	{
		System.out.println("Bhaag raha hai........");
	}
}
