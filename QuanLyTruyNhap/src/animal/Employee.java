package animal;

public class Employee extends Person {
	String ten;

	public void thongTin() {
		this.ten = "Lan";
		System.out.println(" Lại là :" + this.ten);
		
		super.thongTin();// truy xuất từ lớp cha
	}
}