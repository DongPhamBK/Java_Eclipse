package animal;

public class Employee extends Person {
	String ten;

	public void thongTin() {
		this.ten = "Lan";
		System.out.println(" Đó là :" + this.ten);
		
		super.thongTin();// truy xuất từ lớp cha
		// thao tác này sẽ in ra Nam là từ lớp cha
	}
}
