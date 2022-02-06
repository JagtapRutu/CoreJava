package controlstatement;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =153;
		int sum=0;
int arm=num;
		 while(num!=0) {
			 int r=num%10;
			 sum=sum+(r*r*r);
			 num=num/10;
			 
			 
		 }
		 if (arm==sum) {
			 System.out.println(arm+"is armstrong number");
			   
			 
			 
			 
		 }


	}

}
