package MethodConcept;

public class FibonnacciSeries {

	public static void main(String[] args) {
		int i=0;
		int j=1;
		int sum;
		System.out.print(  i + " " + j);
		for (int x=2;x<10; x++);
		sum=i+j;
		System.out.print( " " +sum);
		i=j;
		j=sum;
		
		
		fib(0,1);
		
		

	}

	private static String fib(int i , int j) {
		// TODO Auto-generated method stub
		int sum ;
		int x=2;
		System.out.println(i + "  " +  j);
		while(x<10) {
			sum=i+j;
			res = res + "  " + sum;
			i=j;
			j=sum;
			x++;
		}
		return res;
		
		
	}
	

}
