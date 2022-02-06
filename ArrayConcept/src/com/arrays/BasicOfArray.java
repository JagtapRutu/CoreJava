package com.arrays;

public class BasicOfArray {

	public static void main(String[] args) {
	
	//NEED OF ARRAY -> STUDENT=100,STUDENT ID =101
	// WHEN TO USE ARRAY ->SIZE OF ELEMENT AND SIZE OF OBJ IS FIXED	
	// IS AN OBJ WHICH CONTAIN ELEMENTS OF SIMILAR DATA TYPE IN CONTIGIOUS MEMERY LOCATION
	// ARRAYS IS INDEX BASED
	//ADVANTAGES 1-> CODE OPTIMIZATION, 2->RANDOM AXIS
	//DISADVANTAGES	1-> ITS IN FIX SIZE 2-> HOMOGENIOUS DATA TYPE
	//ARRAY DECLARATION 
	//1= ONE DIMENSIONAL ARRAY	
		int[] x;
		int []y;
		int z[];
	//AT THE TIME OF DECLERATION YOU CANT GIVE SIZE OF ARRAY
	//int[6] X	
	// TWO DIMENSIONAL ARRYA
		int[][] a;
		int [][]b;
		int c[][];
		int[] []d;
		int[] e[];
		int []f[];
	//CHEAK ARRAY DECLERATION
		int[] p,q; //p=1dim and q=1dim
		int[] r[],t;//r=2dim  t=1dim
		int[] s[],h[];//s=2dim  h=2 dim
		int[] []w,l;//w=2dim  l=2 dim
		int[] []g, o[];//g=2dim  o=3 dim
	// []is allow only for 1 var
	//3 DIMENTIONAL ARRAY 
		int[][][] a1;
		int [][][]a2;
		int a3[][][];
		int[] [][]a4;
		int[] []a5[];
		int[] a6[][];
		int[][] a7[];
		int[][] []a8;
		int [][]a9[];
		int []a0[][];
	//ARRAY CREATION 
		int[] b1;//DECLERATION OF ARRAY
		b1=new int[6];//INITIALISATION OF ARRAY
		int[] b2=new int[9];
		int[][] b3=new int[4][3];
		double[] b4=new double[2];
		short[] b5=new short[9];
		boolean[] b6=new boolean[9];
		byte[] b7=new byte[9];
		System.out.println("cheak which type of array created?"+b2.getClass().getName()+b3.getClass().getName());
	// CAN ARRAY BE THE SIZE OF ZERO YES
		int[]p1=new int[0];
		System.out.println("lenght of array"+p1.length);
	// CAN ARRAY HAVE NEGATIVE SIZE	
	//int[]p2=new int[-5];
	//System.out.println("lenght of array"+p2.length);
	//ARRAY CAN HAVE THE CHARACTER SIZE
		int[] c1=new int['A'];
		System.out.println("lenght of array"+c1.length);
		
		
		
		
		
		
		
		

	}

}
