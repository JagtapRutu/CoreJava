package controlstatement;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		//IF ELSE --> WE HAVE SINGLE CONDITION TO CHECK BUT IT CAN HAVE TWO POSSIBILITIES
		int a=20;
		int b=30;
		 
		if(a%b==0) {
			System.out.println(b+ " is divisible by "+a);
			
		}
		else {
			System.out.println(b+"is not divisible by"+a);
			
	//STUDENT HAS EXAM --> GOT RESULT MARKS>75-WILL GET SHOES
			
			Scanner sc = new scanner(System.in);
			
			System.out.println("ENTER STUDENT NAME");
			String name = sc.next();
			System.out.println(" ENTER STUDENT MARKS");
			int marks = sc.nextInt();
			if (marks>75) {
		System.out.println( name + "WILL GET SHOES AS A PRICE");
				
			}else
				System.out.println(name+"scored less than 75 no shoes");
			
			
			
			
			
			
		}
	}

}
