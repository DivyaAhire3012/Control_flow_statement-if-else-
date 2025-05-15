//Write a program to categorize a person based on gender and age: Male, age > 21 → Eligible for marriage .Female, age > 18 → Eligible for marriage
//Otherwise, not eligible


package Practice_code;

import java.util.Scanner;

public class Gender {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the Age");
		int age=sc.nextInt();
		
		if(age>21){
			System.out.println("Eligible male for marriage");
		}
		else if(age>18){
			System.out.println("Eligible female for marriage");
		}
		else{
			System.out.println("Not Eligible");
		}
		
		sc.close();
		
	}

}
