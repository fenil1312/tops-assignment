package module2;

abstract class Shape {

	abstract void rectangleArea(int length, int breadth);

	abstract void squareArea(int size);

	abstract void circleArea(int radios);
}

class Area extends Shape {

	void rectangleArea(int length, int breadth) {
		int area = length * breadth;
		System.out.println("Area of Rectangle is " + area);
	}

	void squareArea(int size) {
		int area = size * size;
		System.out.println("Area of Square is " + area);
	}

	void circleArea(int radios) {
		final double pi = 3.14;
		double area = pi * radios * radios;
		System.out.println("Area of Circle is " + area);
	}
}

public class ShapeDemo {

	public static void main(String[] args) {

		Area a = new Area();

		a.rectangleArea(3, 4);
		a.squareArea(4);
		a.circleArea(4);
	}
}
