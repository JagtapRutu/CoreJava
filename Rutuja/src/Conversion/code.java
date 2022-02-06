package Conversion;

public class code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string to int
		String a="100";
		String b="200";
		int i = Integer.parseInt(a);
		int j =Integer.parseInt(b);
		System.out.println("Addition after coversion "+(i+j));
		 
		//int to string
		int c=3;
		String d= String.valueOf(c);
		String e= Integer.toString(c);
		String f= String.format("%d" , + c);
		System.out.println(d + ""+e+"" +f );
		
		
		

	}

}
