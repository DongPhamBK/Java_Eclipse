package company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5];
		
		NhanVien[] top = new NhanVien[3];
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap vao:");
		for(int i  =0;i<top.length;i++)
		{
			String ten = input.nextLine();
			String tuoi  = input.nextLine();
			String nha = input.nextLine();
			
			top[i] = new NhanVien(ten, tuoi, nha); 
			
			//xoá bộ nhớ đệm; tiện vl
			input.nextLine();
		}
		
		for(NhanVien i : top){
			System.out.println(i.getTen());
		}
	}

}
