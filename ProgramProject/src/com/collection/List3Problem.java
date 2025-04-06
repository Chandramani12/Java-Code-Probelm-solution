package com.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.*;
public class List3Problem {
	
	public static void main(String[] args) throws IOException {
		int aliceScore=0;
		int bobScore=0;
		
		BufferedReader bufferReader=new BufferedReader(new InputStreamReader(System.in));
		List<Integer> a=Arrays.stream(bufferReader.readLine().split(" "))
				.map(Integer::parseInt).collect(Collectors.toList());
		
		List<Integer> b=Arrays.stream(bufferReader.readLine().split(" "))
				.map(Integer::parseInt).collect(Collectors.toList());
		 for (int i = 0; i < 3; i++) {
	            if (a.get(i) > b.get(i)) {
	                aliceScore++;
	            } else if (a.get(i) < b.get(i)) {
	                bobScore++;
	            }
	        }
		
		
		
		 System.out.println(aliceScore + " " + bobScore);

	        // ✅ Close BufferedReader
		 bufferReader.close();
	}

}
