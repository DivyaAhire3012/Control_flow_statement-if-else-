//Write a program to check the eligibility of a student for a scholarship based on marks and income criteria.



package Practice_code;

import java.util.Scanner;

public class Scholarship {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Students marks");
		int marks=sc.nextInt();
		
		System.out.println("Enter the Students income");
		double income=sc.nextDouble();
		
		if(marks>=85 && income<35000){
			System.out.println("Eligible for Scholarship");
		}
		else{
			System.out.println("Not Eligible for Scholarship ");
		}
		
		sc.close();
	}

}
