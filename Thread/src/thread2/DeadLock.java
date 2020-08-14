package thread2;

public class DeadLock implements Runnable {

	public synchronized void test1() {
		System.out.println("T1");
		test2();
	}

	// chơi kiểu xung đột !
	public synchronized void test2() {
		System.out.println("T2");
		test1();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		DeadLock d = new DeadLock();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		t1.start();
		t2.start();
		// xung đột dẫn đến bế tắc rồi !!!
	}
}
