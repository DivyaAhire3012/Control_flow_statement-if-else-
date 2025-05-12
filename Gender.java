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
