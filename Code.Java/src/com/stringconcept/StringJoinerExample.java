package com.stringconcept;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args, String prefix, String suffix) {
		//it is use to construct a sequence of char sepersted by delimiter
		
		StringJoiner sj = new StringJoiner(delimiter ":",);
		sj.add("It");
		sj.add("is");
		sj.add("Example");
		sj.add("StringJoiner");
		System.out.println(sj);
		
		
		StringJoiner sj1 = new StringJoiner(delimiter:",", prefix:"[",suffix:"]");
		sj1.add("It");
		sj1.add("is");
		sj1.add("Example");
		sj1.add("StringJoiner");
		System.out.println(sj1);
		
		StringJoiner sj2 = new StringJoiner(prefix:",");
		sj2.add("It");
		sj2.add("is");
		sj2.add("Example");
		sj2.add("StringJoiner");
		System.out.println(sj2);
		StringJoiner sj3= new StringJoiner(" ");
		StringJoiner merge=sj1.merge(sj2);
		
		
	}

}
