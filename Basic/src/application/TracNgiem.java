package application;

import java.util.Scanner;

public class TracNgiem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("1 + 1 = ?");
			System.out.println("- 2 -");
			System.out.println("- 3 -");
			String dA = input.nextLine();

			if (dA.equals("2")) {
				System.out.println("Đúng !");
				break;
			}else if(dA.equals("3"))
			{
				System.out.println("Sai !");
				break;
			}
			else
				System.out.println("Chọn đi");
				
		}

	}

}
