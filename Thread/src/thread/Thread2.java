package thread;

public class Thread2 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("B: " + i);
		}
	}
}
