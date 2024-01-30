package module2;

class Threadx implements Runnable {

	@Override
	public void run() {

		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}

public class RunnableInterfaceDemo {

	public static void main(String[] args) {

		Threadx x = new Threadx();
		Thread t = new Thread(x);
		t.start();
	}
}
