package module2;

abstract class Marks {

	abstract void getPercentage();
}

class StudentA extends Marks {

	int m1, m2, m3;

	StudentA(int m1, int m2, int m3) {
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	void getPercentage() {
		int total = m1 + m2 + m3;
		float marks = (total / 300f) * 100;
		System.out.println("Marks of Student A is " + marks + "%");
	}
}

class StudentB extends Marks {

	int m1, m2, m3, m4;

	StudentB(int m1, int m2, int m3, int m4) {
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
	}

	void getPercentage() {
		int total = m1 + m2 + m3 + m4;
		float marks = (total / 400f) * 100;
		System.out.println("Marks of Student B is " + marks + "%");
	}
}

public class MarksDemo {

	public static void main(String[] args) {

		StudentA sa = new StudentA(90, 80, 70);
		sa.getPercentage();
		
		StudentB sb = new StudentB(90, 80, 70, 60);
		sb.getPercentage();
	}

}
