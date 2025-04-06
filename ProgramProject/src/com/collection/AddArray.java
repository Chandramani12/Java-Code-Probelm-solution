package com.collection;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;

public class AddArray {
	
	public static void main(String[] args) {
		 List<Integer> listarray = Arrays.asList(1, 2, 3, 4, 5);
	    
	        long totalSum = 0;
	        int min = Integer.MAX_VALUE;
	        int max = Integer.MIN_VALUE;

	        for (int num : listarray) {
	            totalSum += num;
	            if (num < min) min = num;
	            if (num > max) max = num;
	        }

	        long minimumSum = totalSum - max; // exclude the largest
	        long maximumSum = totalSum - min; // exclude the smallest

	        System.out.println("Minimum Sum = " + minimumSum);
	        System.out.println("Maximum Sum = " + maximumSum);
	    }

}
