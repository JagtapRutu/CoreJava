package com.arrays;

public class SimpleArrayConsept {

	public static void main(String[] args) {
		int[] a= {10,20,30};
		//axese elements from array
		for (int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		
		}
		for(int i:a) {
			System.out.println(i);
		}
		// passing array to method
		//find minimum no from array
		 int result =minimum(a);
		 System.out.println(result);
		
		

	}

	private static int minimum(int[] a) {
		int min =a[0];
		for (int i=1;i<a.length;i++) {
			if(min>a[i]) {
			min=a[i];
			
				
				
			}
		}
		return min;
		
		
		
	}

}
