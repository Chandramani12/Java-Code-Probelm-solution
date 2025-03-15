package com.collection;

public class MissingNumber {
	
	// find the missing number in array
	public static void main(String[] args) {
		
	
	int[] num= new int[] {1,2,3,4,7};
	
		//a=n(n+1)/2
		int total=7;
		int expected_sum=total*((total+1)/2);
		int num_sum=0;
		
		for(int i:num) {
			num_sum+=1;
			
		}
		System.out.println(num_sum);
				
	}			
		

}
