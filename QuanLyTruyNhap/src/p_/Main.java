package p_;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person a = new Person();
		a.ten = "a";
		a.dantoc = "Kinh";
		a.tuoi = "31";

		// tuỳ vào kiểu, chẳng hạn ko thể có a.cmnd

		// *****************
		int x = 1;
		int y = 8;

		Phim phimmoi = null;// chưa trỏ vào đâu ca, nên sẽ ko chạy đc bên dưới
		
		//phim.setTen("A") //lỗi vì null
		
		phimmoi = new Phim(); // trỏ tới đối tượng
		
		phimmoi.setTen("A");
	}

}