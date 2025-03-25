package com.collection;

import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumber {
	
	//Write a program to generate random numbers between the given range?
private static int getRandom(int min, int max) {
		
		return ThreadLocalRandom.current().nextInt(min,max+1);
	}
	
	
	public static void main(String[] args) {
		int min=0,max=100;
		
		System.out.println(getRandom(min,max));
	}

	
}
