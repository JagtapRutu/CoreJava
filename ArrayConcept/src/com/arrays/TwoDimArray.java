package com.arrays;

public class TwoDimArray {

	public static void main(String[] args) {
		int row = 3;
		int col=3;
		int[][] a= {
		{10,20,30,40},{40,50,60},{70,80,90}
					
				};
		for (int i=0;i<row;i++) {
		for (int j=0;j<col;j++) {
		System.out.print(a[i][j]+" ");	
		}
		System.out.println(" ");
		}
				
		}
	}


