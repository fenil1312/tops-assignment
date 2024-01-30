package module2;

class ThreadA extends Thread {

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}

public class ThreadClassDemo {

	public static void main(String[] args) {

		ThreadA a = new ThreadA();
		a.start();
	}
}
