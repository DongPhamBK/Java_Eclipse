package abs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Person p = new Person();// đéo được, vì nó là abstract
		Employee c = new Employee();// được, bình thường
		Person d = new Employee();//đa hình, tốt !!!
	}

}
