package com.arrays;

public class JaggedArray {

	public static void main(String[] args) {
		//jagged array is an array of arrays such that member arrays can be diff sizes
		int[][] a= {
				{10,20,30,40},{40,50,60},{70,80,90}
							
						};
		System.out.println(a.length);
		
				for (int i=0;i<a.length;i++) {
				for (int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");	
				}
				System.out.println(a[i].length);
				System.out.println(" ");
				}
				


	}

}
