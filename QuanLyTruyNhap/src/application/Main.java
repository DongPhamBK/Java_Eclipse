package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] ds = new Employee[3];
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập danh sách nhân viên:");
		for (int i = 0; i < ds.length; i++) {
			int x = i + 1;
			System.out.println("Nhân viên thứ " + x);

			String ten = nhap.nextLine();
			String tenDuong = nhap.nextLine();
			/*
			 * 
			 * Khi nhập giá trị, tốt nhất là nhập chữ trước, số sau, nếu ko sẽ
			 * khó chịu đấy !!!
			 * 
			 */
			double luong = nhap.nextDouble();

			Address add = new Address();
			add.setTenDuong(tenDuong);

			//Address add = new Address(tenDuong);//cũng được, thay cho đoạn trên
			
			Employee temp = new Employee(ten, luong);
			temp.setAddress(add);// lằng nhằng
			ds[i] = temp;
			nhap.nextLine();
		}

		System.out.println("Thông tin vừa nhập:");
		for (Employee i : ds) {
			System.out.println(
					"Nhân viên " + i.getTen() + " Địa chỉ " + i.getAddress().getTenDuong() + " Lương " + i.getLuong());

			
			
		}
		ds[0].tinhLuong(4);
		System.out.println(ds[0].tinhLuong(4));
		
	}

}
