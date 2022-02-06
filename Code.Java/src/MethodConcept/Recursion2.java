package MethodConcept;

public class Recursion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =5;
		for (int i=0;i<=n-1;i++) {
			
		}
		int res = fibo(i);
		System.out.println(res + " ");

	}

	private static int fibo(int i) {
		// TODO Auto-generated method stub
		if (i==0) {
			return 0;
			
		}else if (i==1) {
			return 1;
		}else {
			return fibo(i-1)+fibo(i-2);
			
		}
		
		
	}

}
