//Write a program to determine if a character is an uppercase vowel, lowercase vowel, uppercase consonant, or lowercase consonant.


package Practice_code;

import java.util.Scanner;

public class Upper_lower_consonent_vowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("Enter the Character");
		 char ch=sc.next().charAt(0);
		 
		 if(Character.isLetter(ch)){
			 if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
				 System.out.println( ch +"is an Uppercase Vowel");
			 }else if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
				 System.out.println(ch +"is an lower case vowel");
			 }else if(Character.isUpperCase(ch)){
				 System.out.println(ch +" is an Uppercase Consonant");
			 }else{
				 System.out.println(ch +"is a Lowercase Consonant");
			 }
		 }
		
		sc.close();
	}
	

}
