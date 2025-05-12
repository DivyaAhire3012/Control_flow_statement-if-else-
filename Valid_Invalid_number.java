package Practice_code;

import java.util.Scanner;

public class Valid_Invalid_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		if(num<20){
			System.out.println("the number is Valid");
		}
		else{
			System.out.println("the number is not valid");
		}
		
		sc.close();
	}

}
