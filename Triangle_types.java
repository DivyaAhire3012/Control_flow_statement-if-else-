//Write a program to determine the type of triangle (equilateral, isosceles, or scalene) based on user input sides.


package Practice_code;

import java.util.Scanner;

public class Triangle_types {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the 1st side");
		int a=sc.nextInt();
		
		System.out.println("enter the 2nd side");
		int b=sc.nextInt();
		
		System.out.println("enter the 3rd side");
		int c=sc.nextInt();
		
		if(a+b>c && b+c>a &&a+c>b){
			if(a==b && b==c){
				System.out.println("traingle is equilateral");
			}else if(a==b || b==c || a==c){
				System.out.println("triangle is isosceles");
			}else{
				System.out.println("The triangle is Scalene");
			}
		}
		
		sc.close();
	}
}



