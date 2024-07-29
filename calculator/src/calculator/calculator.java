package calculator;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sc1 = 0;
		while(true) {
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("Select the operation:");
	
			sc1= sc.nextInt();
			
			if(sc1 >4 || sc1<1) {
				System.out.println("Invalid Input");
			}
			else {
				break;
			}
		}
		
		System.out.println("Enter the first number");
		int a= sc.nextInt();
		System.out.println("Enter the second number");
		int b =sc.nextInt();
		
		switch(sc1) {
		case 1:
			System.out.println("Addition of two numbers is "+a+b);
			break;
			
		case 2:
			System.out.println("Subtraction of two numbers is "+(a-b));
			break;
			
		case 3:
			System.out.println("Multiplication of two numbers is "+(a*b));
			break;
			
		case 4:
			System.out.println("Divison of two numbers is "+ (a/b));
			break;
		}
		
	}

}
