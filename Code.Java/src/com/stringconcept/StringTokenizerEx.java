package com.stringconcept;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("String Tokenizer Ex");
		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
			
		}
		StringTokenizer st1 = new StringTokenizer("String Token Ex");
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		String s="String,TOKENIZER,Example";
		String[] a =s.split(",");
		System.out.println(a[0]);
		//str="10 20 30 40 50" sum of the number
		StringTokenizer st2 = new StringTokenizer("10,20,30,40,50",",");
		int sum = 0;
		
		while(st2.hasMoreTokens()) {
			int num =Integer.parseInt(st2.nextToken());
			 sum=sum+num;
			
			
			}
			
			System.out.println(sum);
			//print no of tokens present in a string
			StringTokenizer st3 = new StringTokenizer("String Token Ex",",");
			System.out.println("total number of token: " +st3.countTokens());
			
			}
	}


