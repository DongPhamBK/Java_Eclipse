package application;

import java.util.*;

public class Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Nhập a = ");
		int a = input.nextInt();

		if (a == 0)
			System.out.println("Nhập lại ! ");
		else {
			System.out.println("Nhập b = ");
			int b = input.nextInt();

			System.out.println("Nhập c = ");
			int c = input.nextInt();

			System.out.println("*****");

			int d = b * b - 4 * a * c;
			if (d < 0) {
				System.out.println("Vô nghiệm bạn ei !");
			} else if (d == 0) {
				System.out.println("Nghiệm kép x1 = x2 = " + ((-1) * b / 2 / a));
			} else {
				System.out.println("x1 = " + (((-1) * b - Math.sqrt(d)) / 2 / a) + " ;x2 = "
						+ (((-1) * b + Math.sqrt(d)) / 2 / a));
			}

		}

	}
}
