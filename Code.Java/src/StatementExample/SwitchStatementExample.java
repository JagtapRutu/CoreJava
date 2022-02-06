package StatementExample;

import java.util.Scanner;

public class SwitchStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter student level -");
		Scanner sc=new Scanner(System.in);
		String level = sc.next();
		switch(level) {
		case "beginner":
			System.out.println("student does easy level task");
			break;
		case "intermediate":
			System.out.println("student does medium level task");
			break;
		case "expert":
		System.out.println("student does hard level task");
		break;
		default :
			System.out.println("no task was assigned");
			
			System.out.println("enter the division");
			char div = sc.next().charAt(0);
			switch (div) {
			case 'A':
				System.out.println("easy");
				
			}
		
		}

	}

}
