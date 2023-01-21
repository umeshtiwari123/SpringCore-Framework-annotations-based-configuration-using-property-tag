package com.telusko.telusko_annotations_based_config;

import org.springframework.stereotype.Component;

@Component
public class Car implements  Vehicle
{

	public void drive()
	{
		System.out.println("Chal Raha Hai.....");
	}
}