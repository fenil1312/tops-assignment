package module2;

abstract class Bank {

	abstract void getBalance();
}

class BankA extends Bank {

	void getBalance() {
		System.out.println("$100 deposited in Bank A");
	}
}

class BankB extends Bank {

	void getBalance() {
		System.out.println("$150 deposited in Bank B");
	}
}

class BankC extends Bank {

	void getBalance() {
		System.out.println("$200 deposited in Bank C");
	}
}

public class BankDemo {

	public static void main(String[] args) {

		BankA a = new BankA();
		a.getBalance();
		
		BankB b = new BankB();
		b.getBalance();
		
		BankC c = new BankC();
		c.getBalance();
	}

}
