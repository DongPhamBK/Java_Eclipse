package inner;

public class Animal {
	// inner
	public class Cat {
		private int t;

		public int getT() {
			return t;
		}

		public void setT(int t) {
			this.t = t;
		}

		public void hello() {
			System.out.println("Gau Gau !!!");
		}
	}
	
	public class MoonCat extends Cat {
		//có thể kế thừa bên trong, nhưng bên ngoài thì chịu nhé !!!
		int moon  = 10;
	}

	public static void main(String[] args) {
		Animal miu = new Animal();// ok, khai báo kiểu Animal
		Animal.Cat li = miu.new Cat();// khá lằng nhằng, phải thông qua miu mới
										// đến li nh
		// Animal.Cat a = new Animal.Cat();//éo được !!!
		li.hello();
		
		Animal dog  = new Animal();
		Animal.Cat runa = dog.new Cat();
		Animal.MoonCat nuln = dog.new MoonCat();// phức tạp ghê !!!
		System.out.println(nuln.moon);
				}
}
