package com.collection;
import java.util.*;
public class StreamClass {
	
	
	public static void main(String[] args) {
	
		ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,4));
		
		
		System.out.println(arr.stream().mapToInt(Integer::intValue).sum());
	}

}
