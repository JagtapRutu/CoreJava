package com.stringconcept;

public class Conversions {

	public static void main(String[] args) {
		//stringbuilder to stringbuffer
		StringBuilder sb = new StringBuilder();
		System.out.println("sb-"+sb.getClass());
		sb.append("abc");	
		StringBuffer sbb = new StringBuffer(sb);
		sbb.append(" XYZ");
		System.out.println("sb to sbb: "+sbb);
		
		//Stringbuffer to builder
		StringBuffer sb1 = new StringBuffer();
		System.out.println("sb -"+sb1.getClass());
		sb.append("abc");	
		StringBuilder sbb1 = new StringBuilder(sb);
		sbb.append(" XYZ");
		System.out.println("sb to sbb: " +sbb);
		
		//string to string buffer
		String s =  "Rutuja";
		StringBuffer sb2 = new StringBuffer(s);
		System.out.println("s to sb2: "+sb2.append(" ABC"));
		
		//string to string buider
		StringBuilder sb3 = new StringBuilder();
		System.out.println("Sb-"+sb3.getClass());
		sb3.append("abc");	
		StringBuffer sb5 = new StringBuffer(sb3);
		sbb.append("XYZ");
		System.out.println("sb to sbb: "+sb3);
		
		//string buffer to string
		StringBuffer sb4 = new StringBuffer("PQR");
		String ss =new String(sb4);
		ss=ss.concat("LMN");
		System.out.println(ss);
		//
		StringBuffer sb6 = new StringBuffer("PQR");
		String ss1 =new String(sb5);
		ss1=ss1.concat("LMN");
		System.out.println(ss);
		
		
		
		
	}

}
