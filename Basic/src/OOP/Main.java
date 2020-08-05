package OOP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person n1 = new Person();
		n1.setTen("kios");
		n1.setTuoi(12);

		System.out.println("Đối tượng " + n1.getTen() + " " + n1.getTuoi());

		// get.Ten() VÌ KO CÓ STATIC !!!

		Action c = new Action();
		c.setAn("cơm");
		System.out.println(c.getAn());

		Action d = new Action();
		System.out.println(d.getAn());

		//sử dụng constructor nhanh chóng cho việc gán giá trị obj, có thể thay cho get set bình thường !
		Action e = new Action("nhanh", "cơm", "tối");
		
		System.out.println(e.getAn());
		System.out.println(e.getChay());
	}

}