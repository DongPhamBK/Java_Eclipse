package inter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalNew miu = new AnimalNew();
		Animal liu = new AnimalNew();
		// dùng như bình thường thôi, dù nó cao cấp hơn
		
		Employee ok = new EmployeeNew();
		ok.luong();
		Animal jon  = new EmployeeNew();// hơi buồn cười, nhưng vì nó implements nên vẫn được !!!
	}

}
