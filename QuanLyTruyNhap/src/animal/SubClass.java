package animal;

public class SubClass extends SuperClass {

	@Override // để cho vui
	public float tong(float a, float b) {
		// TODO Auto-generated method stub
		return a + b + 10.5f;
		// return super.tong(a, b); // cái này sẽ à super, trỏ đến lớp cha
	}
	
	//overide là ghi đè hàm của lớp cha, đừng ghi sai nhé
	
	public static void main(String[] args) {
		SubClass b = new SubClass();
		//b.tong(1.1, 2.2);
		System.out.println(b.tong(1.1f, 2.2f));
	}
}
