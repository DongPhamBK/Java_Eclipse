package caudieukien;

import java.util.Scanner;

import chuvidientich.HinhVuong;

public class Mennu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập x");
		
		int x = nhap.nextInt();
		
		switch (x) {
		case 1:
			System.out.println("Diện tich cần tìm");
			System.out.println(HinhVuong.dienTich(5));
			break;

		default:
			System.out.println("Thôi nhé !");
			break;
		}
	}

}
