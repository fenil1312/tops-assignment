package module2;

class Rectangle {

	int length;
	int breadth;

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	Rectangle() {

	}

	void area() {
		int area = length * breadth;
		System.out.println("Area is " + area);
	}

	void perimeter() {
		int perimeter = 2 * (length + breadth);
		System.out.println("Perimeter is " + perimeter);
	}
}

class Square extends Rectangle {

	Square(int side) {
		super(side, side);
	}
}

public class PerimeterOfRectangleAndSquare {

	public static void main(String[] args) {

		System.out.println("For Rectangle : ");
		Rectangle r = new Rectangle(4,5);
		r.area();
		r.perimeter();

		System.out.println("\nFor Square : ");
		Square s = new Square(4);
		s.area();
		s.perimeter();
	}

}
