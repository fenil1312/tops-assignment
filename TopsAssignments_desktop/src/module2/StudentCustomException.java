package module2;

import java.util.*;

class AgeNotWithinRangeException extends Exception {

	AgeNotWithinRangeException(String msg) {
		super(msg);
	}
}

class NameNotValidException extends Exception {

	NameNotValidException(String msg) {
		super(msg);
	}
}

class Student {

	int roll_no;
	String name;
	int age;
	String course;

	Student(int roll_no, String name, int age, String course) {
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
		this.course = course;
	}

	Student() {

	}
}

public class StudentCustomException {

	public static void main(String[] args) throws AgeNotWithinRangeException, NameNotValidException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student Details : ");
		System.out.print("Roll no. : ");
		int roll_no = sc.nextInt();

		sc.nextLine();
		System.out.print("Name : ");
		String name = sc.nextLine();
		char[] ch = name.toCharArray();
		for (char i = 0; i < ch.length; i++) {
//			System.out.println(ch[i]);
			if (!Character.isAlphabetic(ch[i])) {
				throw new NameNotValidException("Name not contain numbers or special symbols   ");
			}
		}
		System.out.print("Age : ");
		int age = sc.nextInt();
		if (age <= 15 || age >= 21) {
			throw new AgeNotWithinRangeException("Age not valid   ");
		}

		sc.nextLine();
		System.out.print("Course : ");
		String course = sc.nextLine();

		try {
			Student s1 = new Student(roll_no, name, age, course);
		}

		catch (Exception e) {
			System.err.println(e);
		}
	}
}
