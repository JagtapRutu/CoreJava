package controlstatement;

import java.util.Scanner;

public class NewArmonstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //range start and end-->how many arm we have this perticular range
		//find out no of arm no in given range
		//use math pow method
		
		int n1, n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		n1=sc.nextInt();
		System.out.println("Enter the first number:");
		n2=sc.nextInt();
		
		for(int i=n1; i<n2; i++)
		{
			int sum=0;
			n1=i;
					 while(n1 !=0) {
						 int r=n1%10; 
						 sum=sum+(r*r*r);
						 n1=n1/10;
						 
						 
					 }
					 if (sum==i) {
						 System.out.println(i+"is armstrong number");
					 }
		}
		}
	}


