package abs;

// sử dụng abstract class, thêm từ abstract
public abstract class Person {
	private String ten;

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

	public abstract double luong();// không có nội dung luôn, cái này để ép phải override đây mà

}
