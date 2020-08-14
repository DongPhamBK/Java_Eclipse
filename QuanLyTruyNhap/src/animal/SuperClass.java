package animal;

//overload
public class SuperClass {
	public int tong(int a, int b) {
		return a + b;
	}

	public float tong(float a, float b) {
		return a + b;
	}

	public int tong(int a) {
		return a + a;
	}
	
	public static void main(String[] args) {
		SuperClass a = new SuperClass();
		a.tong(4);
		a.tong(3.3f,4.4f);//kiểu float khó chịu ghê
	}
}
