package com.collection;

public class MoveallZeroes {
public static void main(String[] args) {
	//to Move all zeroes to end of array
	int count=0;
	int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			arr[count++]=arr[i];
		}
	}
	while(count<arr.length) {
		arr[count++]=0;
	}
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
	}
}
}
