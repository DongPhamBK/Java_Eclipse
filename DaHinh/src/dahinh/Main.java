package dahinh;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ee = new Employee();
		Person p = new Employee();// chính là đa hình

		ee.setTen("a");
		ee.setLuong(3);
		
		p.setTen("b");//chỉ có cái này thôi, vì nguyên mẫu nó là person
		
		ee.name();
		p.name();// gọi đến con vì nó là runtime, gọi đến đối tượng trong employee, đó là do đa hình
	
	}

}
