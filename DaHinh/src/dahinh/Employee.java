package dahinh;

public class Employee extends Person {
	private int luong;

	public int getLuong() {
		return luong;
	}
// dùng private như là đóng gói
	public void setLuong(int luong) {
		this.luong = luong;
	}

	@Override
	public void name() {
		System.out.println("Class con");

	}
}
