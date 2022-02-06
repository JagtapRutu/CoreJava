package controlstatement;

import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("year of study");
		int year = sc.nextInt();
		System.out.println("branch");
		String b = sc.next();
		 
		switch (year){
		case 1:
			System.out.println("you have common subjects");
			break;
		case 2:
			switch (b) {
			case "CS":
				System.out.println("yoy have cs department subjects");
			break;
			case "IT":
				System.out.println("you have it department subject");
				break ;
				default:
					System.out.println("invalid branch");
					
				
			}
		}
		
		

	}

}
