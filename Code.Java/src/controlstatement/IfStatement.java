package controlstatement;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		// IF STATEMENT --> IT IS USED WHEN WE HAVE SINGLE CONDITION TO CHECK
	 int a=20; int b=10;
	 if (a>b) {
		 System.out.println(a+"is greater than"+b);
		 
	 }
	 Scanner sc = new Scanner(System.in);
	 System.out.println("ENTER THE STUDENT NAME" );
	 String studentname=sc.next();
	 int studentage= sc.nextInt();
	 
	 if(studentage>18) {
		 
		 System.out.println("ALLOWED IN PARTY" +studentage);
		 
		 
	 }
	 
	 
	}

}
