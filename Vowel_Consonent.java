package Practice_code;

import java.util.Scanner;

public class Vowel_Consonent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the any letter");
		char ch=sc.next().charAt(0);
		
		if((ch>='a' && ch<='z')){
			if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u'){
				System.out.println("vowels");
			}
		}
		else{
			System.out.println("Consonents");
		}
		
		sc.close();
	}

}
