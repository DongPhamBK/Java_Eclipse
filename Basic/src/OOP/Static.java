package OOP;

public class Static {

	static int a = 10;
	int b = 23;
	public static int Example(int x)
	{
		return x*x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Static.a);
		Static.a++;
		System.out.println(Static.a);
		
		Static e1 = new Static();
		
		Static e2 = new Static();
		
		e2.a = 1999;
		System.out.println(Static.a);
		// sự thay đổi bên trên đã làm cho toàn bộ bị thay đổi, đây là biến STATIC
		
		System.out.println(e2.a);
		
		/*
		 * 
		 * STATIC LÀ BIẾN/HÀM CỦA CLASS HAY STATIC
		 * 
		 */
		
		e2.b = 9;
		System.out.println(e2.b);
	}

}
