package com.arrays;

public class ReturnArrayFromMethod {

	public static void main(String[] args) {
	//double each element in array and return
		int[] result =DoubleArray();
		for(int i:result) {
			System.out.println(i);
		}

	}

	private static int[]  DoubleArray() {
		int[] a= {1,2,3,4,5};
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]*2;
			
		}
		return a;
		
	}

}
