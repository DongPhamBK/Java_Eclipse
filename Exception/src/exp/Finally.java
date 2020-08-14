package exp;

public class Finally {
public static void main(String[] args) {
int[] a = {1,2};
	

	try {
		System.out.println(a[2]);
		//System.out.println(a[0]);// kiểu gì cũng finally
	} catch (Exception e) {
		System.out.println("Lỗi_mảng" + e);
	}finally {
		System.out.println("Vui lòng xem lại !!!");// luôn thực thi, kể cả có bị exp hay không !
	}
}
}
