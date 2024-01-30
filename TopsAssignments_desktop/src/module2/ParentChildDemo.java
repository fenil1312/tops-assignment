package module2;

class Parent {
	
	void parentMethod() {
		System.out.println("Parent method is called");
	}
}

class Child extends Parent {
	
	void childMethod() {
		System.out.println("Child method is called");
	}
}

public class ParentChildDemo {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.parentMethod();
		
		Child c = new Child();
		c.childMethod();
		
		c.parentMethod();

	}

}
