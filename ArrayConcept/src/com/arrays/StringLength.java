package com.arrays;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
	//calculate length 	
	//output:enter no of strings ->2 -> name of student->rutu->4(take two time user)
	
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The No Of String:");
	num=sc.nextInt();
	for (int i=1;i<num;i++) {
		String []st=new String[num];
		System.out.println("Enter Name Of Student");
		String Name =sc.next();
		int result= FindLengthMethod(Name);	
		System.out.println("Length Of "+Name+" is "+result);
		
	
	
	}

	
		
	}

	private static int FindLengthMethod(String name) {
		return name.length();
	}
///
}
