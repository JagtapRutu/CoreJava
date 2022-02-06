package Project;

import java.util.StringTokenizer;

public class TextUtil {
 public static String upperCase (String str) {
	return str.toUpperCase();
	
	 
 }
 public static String LowerCase (String str) {
		return str.toLowerCase();
 }
 public static String SentenceCase (String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
			
		}
 public static String TitleCase (String str) {
	 StringTokenizer st = new StringTokenizer(str);
	 String a= "";
	 while (st.hasMoreTokens()) {
		 String s= st.nextToken();
		 
		 s= s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
		 a=a+" "+s;
	 }
	return a;
 }
 public static int WordCase (String str) {
	 StringTokenizer st = new StringTokenizer(str);
	 return st.countTokens();
	 
 }
 public static int CharacterCase (String str) {
	 return str.length();
 
 }
 public static String DigitCase (String str) {
	 String st ="";
	for (int i=0;i<str.length();i++) {
		Character c= str.charAt(i);
		if (c.isDigit(c)) {
			st=st+" "+str.charAt(i);
			
		}
		
			
		}
	return st;
	}
	 
 
	
	 
 
 
		
}
