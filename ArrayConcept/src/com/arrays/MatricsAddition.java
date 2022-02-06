package com.arrays;

import java.util.Scanner;

public class MatricsAddition {

	public static void main(String[] args) {
		System.out.println("Matrix addition");
		Scanner a=new Scanner(System.in);
		System.out.println("No Of Rows And Cloumns");
		int no =a.nextInt();
		int[][] m1=new int[no][no] ;
		System.out.println("Enter Data For Matrics One");
		for (int i=0;i<no;i++) {
			for (int j=0;j<no;j++) {
		int data = a.nextInt();	
		m1[i][j]=data;
		
			}
		}
	//a[2][2]={{4,5},{6,7}}	
	//a[0]={4,5},a[1]={6,7}	
		System.out.println("see matrix 1");
		for(int[] col:m1) {
			for(int elem:col) {
				System.out.print(elem+" ");
			}
			System.out.println(" ");
		}
		int[][] m2=new int[no][no] ;
		System.out.println("Enter Data For Matrics Two");
		for (int i=0;i<no;i++) {
			for (int j=0;j<no;j++) {
		int data = a.nextInt();	
		m1[i][j]=data;
		
			}
	
		}
		System.out.println("result matrics 1");
		int[][] m1=new int[no][no] ;
		System.out.println("Enter Data For Matrics One");
		for (int i=0;i<no;i++) {
			for (int j=0;j<no;j++) {
		int data = a.nextInt();	
		m1[i][j]=data;
		
			}
		}
	//a[2][2]={{4,5},{6,7}}	
	//a[0]={4,5},a[1]={6,7}	
		System.out.println("see matrix 1");
		for(int[] col:m1) {
			for(int elem:col) {
				System.out.print(elem+" ");
			}
			System.out.println(" ");
		}
		
		}

	


