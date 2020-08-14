package outer;

public class Person {
	public void hi() {
		Kid child = new Kid();// dùng như thường !
		child.hello();

	}
}

// outer class
// class này đi kèm
class Kid {// ko có pubic hay gì gì nha !!!
	public int a;

	public void hello() {
		System.out.println("Hello");
	}
}