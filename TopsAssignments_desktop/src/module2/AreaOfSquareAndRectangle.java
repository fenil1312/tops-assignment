package module2;

public class AreaOfSquareAndRectangle {

	void area(int side) {
		int square = side * side;
		System.out.println("Area of square : " + square);
	}

	void area(int length, int breadth) {
		int rectangle = length * breadth;
		System.out.println("Area of rectangle : " + rectangle);
	}

	public static void main(String[] args) {

		AreaOfSquareAndRectangle asr = new AreaOfSquareAndRectangle();

		asr.area(4);
		asr.area(4, 5);

	}

}
