package is_has;

public class Person {
	private String ten;
	private DiaChi diaChi;// Has A: mọi persion đều có địa chỉ

	public Person() {

	}

	public Person(String ten) {
		super();
		this.ten = ten;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public DiaChi getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(DiaChi diaChi) {
		this.diaChi = diaChi;
	}

}
