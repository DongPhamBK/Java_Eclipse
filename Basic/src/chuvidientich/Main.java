package chuvidientich;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;// cạnh hình vuông
		int b = 6;// rộng
		int c = 89;// dài

		int dienTichHinhVuong = HinhVuong.dienTich(a);
		int chuViChuNhat = HinhChuNhat.chuVi(b, c);
		System.out.println("S = " + dienTichHinhVuong);
		System.out.println("C = " + chuViChuNhat);
	}

}
