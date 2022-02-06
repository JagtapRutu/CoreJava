package com.stringconcept;
class BufferandBuilderMethod{
	public static void MethodInsert(){
		//it use to concat the given string
		StringBuffer sb= new StringBuffer("ABC");
		sb.append("XYZ");
		System.out.println(sb);
		StringBuilder sb1= new StringBuilder("ABC");
		sb1.append("XYZ");
		System.out.println(sb1);
		
	}
	public static void MethodTnsert() {
		//insert the given string at given position
		StringBuilder sb3= new StringBuilder("pqr"); 
		sb3.insert(1, "MNB");
		System.out.println(sb3);
		
		
			
		}
	public static void MethodDelete() {
		//it delete the string from specified index to the end index
		StringBuffer sb6 =new StringBuffer("LKJHGF");
		sb6.delete(2, 5);
		System.out.println(sb6);
		StringBuilder sb7 =new StringBuilder("LKJHGF");
		sb7.delete(4, 6);
		System.out.println(sb7);
	}
	public static void MethodReverse() {
		//it reverse current string
		StringBuffer sb9 =new StringBuffer("LKJHGF");
		sb9.delete(2, 5);
		System.out.println(sb9);
		StringBuilder sb8 =new StringBuilder("LKJHGF");
		sb8.delete(4, 6);
		System.out.println(sb8);
	}
	public static void MethodReplace() {
		StringBuffer sb4 =new StringBuffer("LKJHGF");
		sb4.replace(2, 5, "QWERTY");
		System.out.println(sb4);
		StringBuilder sb5 =new StringBuilder("LKJHGF");
		sb5.replace(4, 6, "QWERTY");
		System.out.println(sb5);
		
		
	}
	}

public class StringBufferAndBuilderMethod {

	public static void main(String[] args) {
		
		
		BufferandBuilderMethod.MethodInsert();
		BufferandBuilderMethod.MethodReplace();
		BufferandBuilderMethod.MethodDelete();	
		BufferandBuilderMethod.MethodReverse();}

}
