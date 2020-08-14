package thread;

public class TestThread extends Thread {
	private String name1;// đặt tên là name nó không được !!!

	public TestThread() {
	}
	public TestThread(String name1) {
		super();
		this.name1 = name1;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("~" + this.getName1() + " " + i);
			try {
				Thread.sleep(1000);// ngủ chờ của thread !
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		TestThread t1 = new TestThread("a");
		TestThread t2 = new TestThread("b");
		
		t1.start();
		t2.start();
	}
}