package com.arrays;

import java.lang.reflect.Array;

public class JavaReflectionArray {

	public static void main(String[] args) {
		//java reflection class provides static methods that use to creat an axes java array in dinyamic manner
		//at a run time it ensures your type of data 
		int size =5;
		int[] a=(int[]) Array.newInstance(int.class, size);
		//int.class is my component type and size is my length of array
		Array.setInt(a, 0, 10);
		Array.setInt(a, 1, 20);
		Array.setInt(a, 2, 30);
		Array.setInt(a, 3, 40);
		Array.setInt(a, 4, 50);
		//printing array reflection use for each
		for (int b:a) {
			System.out.println(b);
			
		}
		//two dim array reflection
		int[][] c=(int[][]) Array.newInstance(int.class, 2,2);
		int[] row1=(int[]) Array.get(c,0);
		int[] row2=(int[]) Array.get(c,1);
           Array.setInt(row1, 0, 10);
           Array.setInt(row1, 1, 20);
           Array.setInt(row2, 0, 30);
           Array.setInt(row2, 1, 40);
           for(int i=0;i<2;i++) {
        	for (int j=0;j<2;j++) {
        		System.out.println("matrics"+"["+i+"]"+"["+j+"]"+"="+((int [][])c)[i][j]);
        	}
           }
           
		
		


	}

}
