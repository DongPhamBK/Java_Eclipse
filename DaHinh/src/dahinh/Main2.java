package dahinh;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		// ((Worker) p).ngayLamViec();// bị lỗi!!!

		if (p instanceof Worker) {
			((Worker) p).ngayLamViec();
		} else {
			System.out.println("Không ép kiểu được !");
		}
		// instanceof = con của....

		Person p1 = new Worker();
		if (p1 instanceof Worker) {
			System.out.println("Có");
		}
		
		if (p1 instanceof Employee) {// rõ ràng, vì worker là con của employee, nên cũng được
			System.out.println("Có");
		}
	}

}
