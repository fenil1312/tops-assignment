package module2;

class Shape1 {

	void printShape() {
		System.out.println("This is Shape");
	}
}

class Rectangle1 extends Shape1 {

	void printRectangle() {
		System.out.println("This is rectangular shape");
	}
}

class Circle1 extends Shape1 {

	void printCircle() {
		System.out.println("This is circular shape");
	}
}

class Square1 extends Rectangle1 {

	void printSquare() {
		System.out.println("Square is a rectangle");
	}
}

public class PrintShape {

	public static void main(String[] args) {

		Square1 s = new Square1();
		s.printShape();
		s.printRectangle();
	}

}
