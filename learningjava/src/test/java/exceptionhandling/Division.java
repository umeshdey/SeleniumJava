package exceptionhandling;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int a, b, c;
		
		System.out.println("Enter two integers");
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		b = obj.nextInt();
		try {
			c = a/b;
			System.out.println("Result is: " + c);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage());
			System.out.println("Please do not enter 0");
			
		}catch(ArithmeticException e){
			
			System.out.println("provide non-zero value");
			
		}finally {
			
			System.out.println("Finally");
		}
		
		
		System.out.println("More code can go here");
	}

}
