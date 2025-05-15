//Write a program to find the largest of two numbers.

package Practice_code;

import java.util.Scanner;

public class Largest_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number:-");
		int num1=sc.nextInt();
		
		System.out.println("Enter the second number:-");
		int num2=sc.nextInt();
		
		if(num1>num2){
			System.out.println(num1 + "The first number is largest");
			
		}
		else if(num2>num1){
			System.out.println(num2 + "The second number is largest");
			
		}
		else {
	         System.out.println("both number are equal");
		}
		
		sc.close();
	}

}
