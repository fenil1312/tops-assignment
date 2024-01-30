package module2;

import java.util.Scanner;

public class Complex {

	int real, imaginary;

	Complex(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	Complex() {

	}

	void show() {
		System.out.println("(" + this.real + " + " + this.imaginary + "i)");
	}

	static Complex sum(Complex c1, Complex c2) {
		Complex add = new Complex();

		add.real = c1.real + c2.real;
		add.imaginary = c1.imaginary + c2.imaginary;

		System.out.print("\nSum of two complex numbers are : ");
		return add;
	}

	static Complex sub(Complex c1, Complex c2) {
		Complex diff = new Complex();

		diff.real = c1.real - c2.real;
		diff.imaginary = c1.imaginary - c2.imaginary;

		System.out.print("\nDifference of two complex numbers are : ");
		return diff;
	}

	static Complex mul(Complex c1, Complex c2) {
		Complex prod = new Complex();

		prod.real = c1.real * c2.real;
		prod.imaginary = c1.imaginary * c2.imaginary;

		System.out.print("\nProduct of two complex numbers are : ");
		return prod;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first complex number : ");
		System.out.print("Real part : ");
		int real1 = sc.nextInt();
		System.out.print("Imaginary part : ");
		int imaginary1 = sc.nextInt();
		System.out.print("Your first complex number is ");
		Complex c1 = new Complex(real1, imaginary1);
		c1.show();

		System.out.println("\nEnter second complex number : ");
		System.out.print("Real part : ");
		int real2 = sc.nextInt();
		System.out.print("Imaginary part : ");
		int imaginary2 = sc.nextInt();
		System.out.print("Your second complex number is ");
		Complex c2 = new Complex(real2, imaginary2);
		c2.show();

		sum(c1, c2).show();

		sub(c1, c2).show();

		mul(c1, c2).show();
	}

}
