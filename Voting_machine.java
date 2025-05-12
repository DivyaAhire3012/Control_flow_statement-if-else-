package Practice_code;

import java.util.Scanner;

public class Voting_machine {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number:-");
		int num=sc.nextInt();
		
		if(num>=18){
			System.out.println("eligible");
		}
	  else if(num==18){
			System.out.println("they can ready to voting");
		}
	  else{
		  System.out.println("Not Eligible");
	  }
		sc.close();
	}

}
