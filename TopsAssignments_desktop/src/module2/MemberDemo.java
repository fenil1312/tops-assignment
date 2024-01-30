package module2;

class Member {

	String name;
	int age;
	long pno;
	String address;
	int salary;

	Member(String name, int age, long pno, String address, int salary) {
		this.name = name;
		this.age = age;
		this.pno = pno;
		this.address = address;
		this.salary = salary;
	}

	Member() {

	}

	void printSalary() {
		System.out.println("Salary of " + name + " is " + salary);
	}
}

public class MemberDemo {

	public static void main(String[] args) {

		Member m1 = new Member("Fenil",21,9023185494L,"Patan",10000);
		m1.printSalary();
		
		Member m2 = new Member("Ram",22,999999,"Ayodhya",20000);
		m2.printSalary();
		
	}

}
