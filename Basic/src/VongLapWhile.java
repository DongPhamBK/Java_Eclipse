
public class VongLapWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		while (x > 0) {
			System.out.println(x);
			x--;// đk thoát vòng lặp

		}

		System.out.println("***********");
		int[] a = { 1, 2, 4, 6, 7, 5, 4, 3, 5, 7, 7, 6, 5, 5, 5, 6, 7, 88, 8 };
		int dem = 0;
		do {
			System.out.println(a[dem]);
			dem++;//vẫn phải nhớ nó !
		} while (dem < a.length);
	}

}
