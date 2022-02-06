package com.arrays;

public class ThreeDimArray {

	public static void main(String[] args) {
		int[][][] a= {{{10,20,30,40},{15,25,35}},{{40,50,60},{70,80,90}}};
		//a[0][0][0]= {{10,20,30,30,},{15,25,35}}
		//a[0][0][1]= {{40,50,60},{70,80,90}}
		//a[0][0]={10,20,30,40}
		//a[0][1]={15,25,35}
		//a[1][0]={40,50,60}
		//a[1][1]={70,80,90}
		//a[0]=10,a[1]=20,a[2]=30...
	for (int[][] b:a) {
	for (int[] c:b) {
	for (int item:c) {
		System.out.print(item+" ");
	}
	System.out.println(" ");
		}
	}

	}

}
