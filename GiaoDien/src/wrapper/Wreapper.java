package wrapper;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Wreapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;// ok, không có gì
		Integer y = new Integer(10);// chơi kiểu class, kiểu dữ liệu tham chiếu
		int z = x + y;// autoboxing, chuyển kiểu Int về int
		System.out.println(z);

		String a = "2010";
		int z1 = Integer.valueOf(a);
		int z2 = Integer.parseInt("234568999");
		System.out.println(z2);

		Boolean.valueOf("true");

		Float d = 10.3f;// boxing, int thành Integer
		Integer q = new Integer(10);
		System.out.println(y == q);// khác đối tượng
		System.out.println(y == 10);
		System.out.println(y.equals(q));// rất hay 
	}

}
