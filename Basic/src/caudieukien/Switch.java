package caudieukien;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);

		System.out.println("Nhập x:");
		int x = nhap.nextInt();
		
		switch(x)
		{
		case 1: System.out.println("x = 1");break;
		case 2: System.out.println("x = 2");break;
		default : System.out.println("K");
		}
	}

}
