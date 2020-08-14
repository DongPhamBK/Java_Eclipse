package thread2;

public class TestThread1 implements Runnable {
	public int tong;

	public TestThread1() {
		this.tong = 1000;
	}

	// dùng throws ngoại lệ
	// thêm syn cho đồng bộ
	public synchronized void rutTien() throws InterruptedException {
		if (tong > 0) {
			Thread.sleep(1000);
			tong = tong - 1000;
			System.out.println(tong);
		} else {
			System.out.println("Het tien !");
		}
	}

	@Override
	public void run() {

		try {
			rutTien();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestThread1 t = new TestThread1();

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);// không đồng bộ

		t1.start();
		t2.start();
	}
}
