package application;

import java.util.Scanner;

public class Search {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int[] a = new int[5];
		int key;
		System.out.println("Nhập mảng:");
		for (int i = 0; i < a.length; i++) {
			int temp = input.nextInt();
			a[i] = temp;
		}

		System.out.println("Nhập key:");
		int tem = input.nextInt();
		key = tem;

		for (int j : a) {
			if (key == j)
				System.out.println("Có tồn tại ! ");
			break;
		}
	}

}
