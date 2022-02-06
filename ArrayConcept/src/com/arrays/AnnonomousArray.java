package com.arrays;

public class AnnonomousArray {

	public static void main(String[] args) {
	//annonomous array is you dont need to declare array while passing array to method
	//find max no from array
		 int result =maximum(new int[] {1,2,3,4,5});
		 System.out.println("max no is"+result);
	}

	private static int maximum(int[] a) {
		int max =a[0];
		for (int i=1;i<a.length;i++) {
			if(max>a[i]) {
			max=a[i];
			
				
				
			}
		}
		return max;
		
		
		
	}

}
