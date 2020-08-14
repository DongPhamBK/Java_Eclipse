
public class Ham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 6;
		System.out.println(sum());
		System.out.println(sub(a, b));
		hello();

		float chuvi = pi() * 5;
		System.out.println(chuvi);
	}

	// ta sẽ có các kiểu khác nhau cho hàm
	public static int sum() {
		int x = 10;
		int y = 15;
		int sum = x + y;
		// return sum;
		return sum;// cái này là tự sih bởi ide, rất tuyệt !!!
	}

	public static int sub(int x, int y) {

		int sub = x + y;
		// return sum;
		return sub;// cái này là tự sih bởi ide, rất tuyệt !!!
	}

	public static void hello() {
		System.out.println("Hello, đây là chương trình ôn tập !");
	}

	public static float pi() {
		return 3.14f;
	}

}
