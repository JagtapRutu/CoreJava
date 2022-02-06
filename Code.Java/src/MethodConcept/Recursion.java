package MethodConcept;

public class Recursion {

	public static void main(String[] args) {
		
		 int res=fact(5);
		System.out.println();

	}

	private static int fact(int i) {
		if(i == 1) {
			return 1;
		}else {
				return i*fact(i-1);
			}
		}
		
		
	}


