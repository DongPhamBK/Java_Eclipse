
public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			break;// ngắt ngay vòng lặp
		}

		System.out.println("******");

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 4)
				break;// ngắt ngay vòng lặp
		}

		System.out.println("******");

		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			for (int j = 0; j < 5;)//máy nó tự sửa đấy !!! 
			{
				System.out.println("j = " + j);
				break;// break chỉ có tác dụng trong 1 cơ cấu vòng lặp, đó
				// là lý do khi in ra màn hình i tăng nhưng j chỉ là 0 do break
				// !

			}
		}
		
		System.out.println("******");

		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			for (int j = 0; j < 5; j++) {
				System.out.println("j = " + j);
				break;// break chỉ có tác dụng trong 1 cơ cấu vòng lặp, đó
				// là lý do khi in ra màn hình i tăng nhưng j chỉ là 0 do break
				// !

			}
		}
	}
}
