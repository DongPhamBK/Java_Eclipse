package company;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee le = new Employee();
		
		le.ten = "Le";//kế thừa
		le.tuoi = 34;
		double mucluong = 1234;//mở rộng
		le.luong  = mucluong;
		le.mucLuong(mucluong);
	}

}