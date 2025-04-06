package com.collection;

import java.io.BufferedReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.IOException;
import java.io.*;

public class MatrixDiagnoal {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedRead=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(bufferedRead.readLine().trim());
		
		List<List<Integer>> arr=new ArrayList<>();
		for(int i=0;i<n;i++) {
		arr.add((List<Integer>) Stream.of(bufferedRead.readLine().split(" "))
				.map(Integer::parseInt).collect(Collectors.toList()));
		}
		bufferedRead.close();
		 int primaryDiagonalSum = 0;
	        int secondaryDiagonalSum = 0;

	        for (int i = 0; i < n; i++) {
	            primaryDiagonalSum += arr.get(i).get(i);           // Left to right diagonal
	            secondaryDiagonalSum += arr.get(i).get(n - i - 1); // Right to left diagonal
	        }

	        // Print diagonal sums
	        System.out.println("Primary Diagonal Sum: " + primaryDiagonalSum);
	        System.out.println("Secondary Diagonal Sum: " + secondaryDiagonalSum);
	        System.out.println("Absolute Difference: " + Math.abs(primaryDiagonalSum - secondaryDiagonalSum));
	    }
	
	
	
	

}
