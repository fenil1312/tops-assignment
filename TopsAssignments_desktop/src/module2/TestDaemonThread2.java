package module2;

public class TestDaemonThread2 extends Thread {

	@Override
	public void run() {

		if (isDaemon()) {
			System.out.println("Daemon Thread");
		}

		else {
			System.out.println("Normal Thread");
		}
	}

	public static void main(String[] args) {

//		System.out.println("Main Thread");

		TestDaemonThread2 t1 = new TestDaemonThread2();
		TestDaemonThread2 t2 = new TestDaemonThread2();

		t1.setDaemon(true);
		t1.start();

		t2.start();
	}

}
