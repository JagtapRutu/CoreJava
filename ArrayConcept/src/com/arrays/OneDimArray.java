package com.arrays;

public class OneDimArray {

	public static void main(String[] args) {
	//STORING VALUES IN ARRAY 
		int[] a1= {10,20,30,40,50};
	//GETTING VALUES FROM THE ARRAY USING FOR LOOP
		for(int i=0 ;i<a1.length;i++) {
		System.out.println(a1[i]);
		
	
			}
		for(int a2:a1) {
	//GETTING VALUES FROM THE ARRAY USING FOR EACH		
			System.out.println(a2);
			
		}
	//TASK ONE SUM OF ALL THE NO IN ARRAY	
		int sum=0;
		for(int i=0 ;i<a1.length;i++) {
			sum= sum +a1[i];
		
		}
		System.out.println(sum)	;
	//FIND EVEN NO FROM THE ARRAYS
		for(int i=0 ;i<a1.length;i++) {
		if (a1[i]%2==0) {
			System.out.println("print even no"+a1[i]);
			
		}
		}
		
				
		}

	}


