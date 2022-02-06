package com.stringconcept;

import java.util.Scanner;

public class StringMethodProject {
	
	
		private static final int b = 0;

		public static void main(String[] args) {
			
			System.out.println("Welcome to Text Util Application:");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your string");
			String a=sc.nextLine();
			System.out.println("1.Upper case\n 2.Lower case\n 3.Sentance case\n 4.Title case\n 5.Find word\n 6.Find character\n 7.Find digit in text\n 8.Exit");
			
			while(true) {
			System.out.println("Enter your choice");
			int b=sc.nextInt();
			
			if(b==1) {
				System.out.println(a.toUpperCase());
			}
			else if(b==2) {
				System.out.println(a.toLowerCase());
			}
			else if(b==3) {
				System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1));
			}
			
			
			else if(b==6) {
				System.out.println(a.length());
		
			}
			//else if(b==4) {
			//	String words[]=a.split("\\s"); 
			   // for(String w:words){  
			    //    String first=w.substring(0,1);  
			    //    String afterfirst=w.substring(1);  
			// }
			else if(b==8) {
				System.out.println("Application Closed");
			}
			   
	
			}
		}


}

