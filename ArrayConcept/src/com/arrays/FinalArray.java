package com.arrays;

public class FinalArray {

	public static void main(String[] args) {
		//final is a key word at its value cant be modifiy and it is constant
		 final int[] a= {1,2,3,4,5};
		int[] b= {6,7,8,9,0};
	//copy array a to array b	
		b=a;
	//	a=b; copy array b to a
		for(int i=0; i<a.length;i++) {
			System.out.println(b[i]);
		}
	}

}
