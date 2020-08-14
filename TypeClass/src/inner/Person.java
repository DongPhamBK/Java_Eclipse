package inner;
//inner static class
// khai báo bên trong thôi
public class Person {
public  static class Kid{
	private int t;

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}
	public void hello(){
		System.out.println("Lại hello");
	}
}

public static void main(String[] args) {
	Person.Kid g = new Person.Kid();// giống struct nhỉ ???
	g.hello();// gọi hàm thì ngon rồi !
}
}
