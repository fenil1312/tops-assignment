package module2;

import java.util.*;

public class AgeException {
	
	static void validate(int age) {
		
		if(age < 18) {
			throw new ArithmeticException("not valid");
		}
		else {
			System.out.println("Welcome to vote");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		
		validate(age);
	}

}
