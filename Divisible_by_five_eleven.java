//Write a program to check if a given number is divisible by both 5 and 11.

package Practice_code;

import java.util.Scanner;

public class Divisible_by_five_eleven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Eneter the number");
		int num=sc.nextInt();
		
		if(num%5==0 && num%11==0){
			System.out.println("Divisible by  5 and 11");
		}else{
			System.out.println("Not divisible by 5 and 11");
		}
		
		sc.close();
	}

}
