package com.stringconcept;

import java.util.jar.Attributes.Name;

class ExampleOfTheMethod
{
	void StringMethod() {
		//string charAt()==>Return a character value at given index number
		//MethodAt();
		//string compareTo()==> Method compare the given string with the current string in the
		//String concat--.method combines specified string at the end of the string 
		
		methodcompareTo();
		methodconcat();
		// IF S1>S2 THEN IT RETURNS POSITIVE NUMBER--->S1 AFTER S2
		//IF S1<S2 THEN IT RETURNS NEGATIVE NUMBER -->S2 AFTER S1
		//IF S1==S2 THEN IT RETURNS ZERO 
		
		//string contains-->method searches the sequence of character in the string and return the boolean
		methodcontains();
		
		//StringindexOf();
		//method return the position of the specified char or string in specified string
		methodindexOf();
		//stringreplacemethod();--> method returns a string replacing all char to the
		methodreplace();
		//String splitmethod();
		//method split the string and return char array
		methodsplit();
		//stringlength();
		//it find length of string
		methodlength();
		//string substring
		//it return part of a string
		methodsubString();
		//stringtrim():
		//method eliminate leading and trailing spaces
		methodtrim();
		//string tolowercase();
		methodtolowercase();
		//stringuppercase();
		methodtouppercase();
	}		
	private void methodtouppercase() {
		
		String Name = "rutuja";
		System.out.println(Name.toUpperCase());
	}
	private void methodtolowercase() {
		
		String Name ="rutuja";
		System.out.println(Name.toLowerCase());
		
	}
	private void methodtrim() {
		
		String Name = "R utuj a";
		System.out.println(Name.length());
		Name=Name.trim();
		System.out.println(Name.length());
		//string is inmutebal
	}
	private void methodsubString() {
		
		String Name = "rutuja jagtap";
		System.out.println(Name.substring(2));
		System.out.println(Name.substring(2,3));
	}
	private void methodlength() {
		
		String Name="rutuja ";
		System.out.println(Name.length());
		
	}
	private void methodsplit() {
		
		String name ="Rutuja, Jagtap, Rutuja";
		int A=Integer.parseInt("name");
		 A=name.split("/s"); 
		System.out.println(A[0]);
		for (String :A) {
			System.out.println(elem);
		}
		  
	}
	private void methodreplace() {
	
		String name = "Rutuja Jagtap Rutu";
		System.out.println("Stringreplace " +Name.replace("Rutuja","Rutu"));
		
	}
	private void methodindexOf() {
		//if it is not contain it will give index=-1 if it is found then it will give specific index
		String Name = "Rutuja Jagtap";
		System.out.println("Stringindex "+ Name.indexOf("Jagtap"));
		System.out.println("Stringindex "+ Name.indexOf("jagtap"));
		//give index and search for char onwards
		System.out.println("character search "+Name.indexOf("o"));
	}
	private void methodcontains() {
		
		String name =" Jagtap";

		System.out.println( "StringContains" +Name.contains(" Jagtap"));
		System.out.println("StringContains" +Name.contains(" jagtap"));
	}
	private void methodconcat() {
	
		String a= "rutu";
	a=a.concat(" rutuja");
	a=a.concat(" code").concat(" from ecs");
	String b= " pointer is".concat(" 8.5");
	a=a.concat(b);
	System.out.println(a);
	}
	private void methodcompareTo() {
		
		String Name="RUTUJA";
		for(int i=0;i<Name.length();i++) {
			System.out.println("Character At Index"+i+"is"+Name.charAt(i));
			System.out.println("character at even index");
		if (i%2 == 0)
			System.out.println("Character At Index"+i+"is"+Name.charAt(i));
	}
	}
	private void methodcharAt() {
		
	}
	}

public class StringMethod {

	public static void main(String[] args) {
		ExampleOfTheMethod f=new ExampleOfTheMethod();
		f.StringMethod();
		
	}
}

