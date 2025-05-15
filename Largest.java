//Write a program to find the largest of three numbers.


package Practice_code;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 1st number");
		int num1=sc.nextInt();
		
		System.out.println("Enter the 2st number");
		int num2=sc.nextInt();
		
		System.out.println("Enter the 3st number");
		int num3=sc.nextInt();
		
		if(num1>num2 && num1>=num3){
			System.out.println("number 1 is largest");
		}
		else if(num2>num1 && num2>num3){
			System.out.println("number 2nd is largest");
		}
		else{
			System.out.println("number  3rd is largest");
		}
		
		sc.close();
	}

}
