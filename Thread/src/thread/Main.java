package thread;

public class Main {
	public static void main(String[] args) {
		Thread1 process1 = new Thread1();
		Thread t = new Thread(process1);// chuyển vào, đối với kiểu này

		Thread2 process2 = new Thread2();
		t.start();
		process2.start();// khác biệt mỗi lần chạy !!!
	}
}
