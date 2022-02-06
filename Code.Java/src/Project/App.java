package Project;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO TEXT UTIL APPLICATION:");
		System.out.println("ENTER THE STRING:");
		String str = sc.nextLine();
		System.out.println("1.Upper case\n 2.Lower case\n 3.Sentance case\n 4.Title case\n 5.Find word\n 6.Find character\n 7.Find digit in text\n 8.Exit");
         
         while (true) {
        	 System.out.println("ENTER YOUR CHOICE:");
         int choice = sc.nextInt();
         switch (choice) {
         case 1: String upper=TextUtil.upperCase(str);
         System.out.println(" uppercase"+upper);
         break ;
         case 2:  String Lower=TextUtil.LowerCase(str);
         System.out.println(" Lowercase"+ Lower);
         break;
         case 3:String Sentence =TextUtil.SentenceCase(str);
         System.out.println(" Sentence"+Sentence);
         break;
         case 4:String Title = TextUtil.TitleCase(str);
         System.out.println(" Title"+Title);
         break;
         case 5:int Word = TextUtil.WordCase(str);
         System.out.println(" Word"+Word);
         break;
         case 6:int Character = TextUtil.CharacterCase(str);
         System.out.println("Character"+Character);
         break;
         case 7: String Digit = TextUtil.DigitCase(str);
         System.out.println("Digit"+Digit);
         case 8:System.out.println("APPLICATION CLOSED");
         System.exit(0);
         break;
         default: System.out.println("YOU ENTER INCORRECT OPTION");
        	 
         
         
         }
         }
	}

}
