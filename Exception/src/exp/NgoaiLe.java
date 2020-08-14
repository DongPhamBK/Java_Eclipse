package exp;

public class NgoaiLe {
public static void main(String[] args) {
	int[] a = {1,2};
	
//	System.out.println(a[2]);// lỗi
	try {
		System.out.println(a[2]);
	} catch (Exception e) {
		System.out.println("Lỗi_mảng" + e);
	}
	
	/*
	 *nếu có nhiều lỗi, tuỳ lỗi mà nhảy vào các catch khác nhau !!! 
	 */
	System.out.println("OK");
}
}

