package com.collection;



public class Pattern {
	

	public static void main(String[] args) {
		int num=4;
		for(int i=1;i<=num;i++) {
			
			for(int j=0;j<num-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("#");	
			}
			System.out.println();
		}
		
	}
	
}
	