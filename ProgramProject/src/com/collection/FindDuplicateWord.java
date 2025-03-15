package com.collection;



public class FindDuplicateWord {

	public static void main(String[] args) {
		 String str = "Big black bug bit a big black dog on his big black nose";
		 String[] words=str.split(" ");
		 int count;
		 
		 for(int i=0;i<words.length;i++) {
			 
			 count=1;
			 
			 for(int j=i+1;j<words.length;j++) {
				 if(words[i]==words[j]) {
					 count++;
					 
					 words[j]="0";
				 }
			 }
			 if(count>1 &&words[i]!="0") {
				 	System.out.println(words[i]);
			 }
		 }
		 
	}
	
}