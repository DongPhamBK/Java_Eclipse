import java.util.*;// cứ thế này cho chắc

public class DocDuLieu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);// khai báo lớp scan
												// ///////////////

		System.out.println("Nhập vào tên bạn ei !");

		String ten = input.nextLine();// chú ý dùng tên lớp scan đã khai báo
										// ////**

		System.out.println("Nhập tuổi bạn ei !");
		int tuoi = input.nextInt();

		System.out.println(" Tên :" + ten + "; tuổi : " + tuoi);
		/*
		 * Nếu đọc chuỗi sau là khó, vì nó sẽ đọc enter tốt nhất khai báo một
		 * Scanner khác rồi đọc, hoặc đọc trước đi !
		 * 
		 */

		Scanner input1 = new Scanner(System.in);//new *-*
		System.out.println("Nhập lớp bạn ei !");
		String lop = input1.nextLine();

		System.out.println(" Lớp :" + lop);
	}

}