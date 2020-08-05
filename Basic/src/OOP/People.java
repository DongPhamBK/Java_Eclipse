package OOP;

public class People {

	// thuộc tính, không có static
	String ten;//biến instancer, là biến đối tượng
	int tuoi;//ĐÉO CÓ STATIC

	// phương thức này ĐÉO có STATIC !!!
	public void action(String ten) {
		System.out.println(ten + " hoạt động !");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People n = new People();
		n.ten = "Dong";
		n.tuoi = 21;
		n.action("a ");
	}

}
