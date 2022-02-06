package com.arrays;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
	//arrays class contains various static methods for manupulating arrays
	//searching , soulting , listing 
	//it uses collection framework
	//axes element using arrays class
		int[] a= {50,40,30,20,10};
		System.out.println(Arrays.toString(a));
	//sorting array element
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
    //searching element in array
		int search =30;
		int index =Arrays.binarySearch(a, search);
		System.out.println(index);
	//copy array till index 
		int [] copy =Arrays.copyOf(a, 2);
		System.out.println(Arrays.toString(copy));
	//fill one values in arrays
		Arrays.fill(a, 10);
		System.out.println(Arrays.toString(a));
		
	}

}
