package module2;

class Triangle {

	double s1;
	double s2;
	double s3;

	Triangle() {
		this.s1 = 4;
		this.s2 = 5;
		this.s3 = 6;
	}

	void area() {
		double s = (s1 + s2 + s3) / 2;
		double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
		System.out.println("Area of Triangle is " + area);
	}

	void perimeter() {
		double perimeter = s1 + s2 + s3;
		System.out.println("Perimeter of Triangle is " + perimeter);
	}
}

public class AreaAndPerimeterOfTriangle {

	public static void main(String[] args) {

		Triangle t = new Triangle();
		t.area();
		t.perimeter();
	}

}
