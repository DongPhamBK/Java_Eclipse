package inner;



public class Employee {
public void luong(){
	// khai báo một class trong method
	// chỉ truy xuất bên trong method đó thôi
	 class Worker{
		public int luong;
		public void lienHoan(){
			System.out.println("Kỷ niệm 10 năm lại là công ty !!!");
		}
	}
	 
	 Worker han = new Worker();
	 han.lienHoan();
}
	 public static void main(String[] args)
	 {
		 Employee E = new Employee();
		 E.luong();
		 //E.lienHoan();//không có nha !!
	 }
}


