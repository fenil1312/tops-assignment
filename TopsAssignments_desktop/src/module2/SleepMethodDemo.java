package module2;

class Thread1 extends Thread {

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		t.setName("Thread 1");

		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println(t.getName() + " : " + i);
				t.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread {

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		t.setName("Thread 2");
		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println(t.getName() + " : " + i);
				t.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class SleepMethodDemo {

	public static void main(String[] args) {

		Thread1 x = new Thread1();
		x.start();

		Thread2 y = new Thread2();
		y.start();
	}

}
