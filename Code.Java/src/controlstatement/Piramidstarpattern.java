package controlstatement;

public class Piramidstarpattern {

	public static void main(String[] args) {
	int num =5;
		
		int row,column;
		//this for loop is for row
		for(row=1; row<=num; row++) {
			for(int space=1; space<=num-row; space++) {
				
				System.out.print(" ");
				
				for(column=1; column<=row; column++) {
					
					System.out.print(" *");
					
				}
				System.out.println();
			}
	}
	}
}
//ROW =1, (1<=5),SPACE = 1,(1<=4),COLUMN=1(1<=1)-->    *   
//ROW =2, (2<=5),SPACE = 1,(1<=3),COLUMN=2(1<=2)-->   * *
//ROW =3, (3<=5),SPACE = 1,(1<=2),COLUMN=3(1<=3)-->  * * *
//ROW =4, (4<=5),SPACE = 1,(1<=1),COLUMN=4(1<=4)--> * * * *
//ROW =5, (5<=5),SPACE = 1,(1<=0),COLUMN=5(1<=5)-->* * * * *
