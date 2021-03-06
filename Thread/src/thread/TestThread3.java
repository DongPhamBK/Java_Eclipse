package thread;

public class TestThread3 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			
			System.out.println(this.getName() + "~" + i);
		}
	}
	
	public static void main(String[] args) {
		
		//tạo luồng
		TestThread3 th1 = new TestThread3();
		TestThread3 th2 = new TestThread3();
		TestThread3 th3 = new TestThread3();
		
		//tên luồng 
		th1.setName("a");
		th2.setName("b");
		th3.setName("c");
		
		// độ ưu tiên có thể từ 1 đến 10
		 th1.setPriority(1);
		 th2.setPriority(10);// cũng không hẳn là tốt
		 th3.setPriority(5);
		 
		 //th1.start();
		 //th2.start();
		 //th3.start(); 
		 
		 th1.setDaemon(true);// chạy ở nền
		 System.out.println(th1.isDaemon());
		 
	}
}
