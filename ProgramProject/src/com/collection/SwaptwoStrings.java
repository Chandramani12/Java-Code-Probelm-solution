package com.collection;

public class SwaptwoStrings {
	
	//Write a java program to swap two string variables without using temp variable?
	
	
	public static void main(String[] args) {
		String a="Hello";
		String b="World";
		System.out.println("before swap String " +a+ " "+b);
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println(a+""+b);
		
	}
	
}
