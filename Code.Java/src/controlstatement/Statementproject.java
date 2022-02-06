package controlstatement;

public class Statementproject {

	public static void main(String[] args) {
		 for (int i=1; i<=5; i++){
			 
			 for( int j=4; j>i; j--) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		
		 
		 }
}
// ROW=1(1<=5),COLUMN=1(1<=1)-->*
//ROW=2(2<=5),COLUMN=1(1<=2)-->**
//ROW=3(3<=5),COLUMN=1(1<=3)-->***
//ROW=4(4<=5),COLUMN=1(1<=4)-->****
//ROW=5(5<=5),COLUMN=1(1<=5)-->*****