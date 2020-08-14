package inner;

public class Main {

	public static void main(String[] args) {
		// anonymous class

		PersonService uk = new PersonService() {

			@Override // vì nó cần như vầy
			public void hello() {
				// TODO Auto-generated method stub
				System.out.println("Dùng class ẩn dạng !");
			}

			@Override
			public void like() {
				// TODO Auto-generated method stub
				System.out.println("Thêm một method khác cho dễ hình dung !");
			}
		};
		uk.hello();
		uk.like();
		
		//-----------------------
		 XinChao ciao = new XinChao() {
			 @Override// cái này giống kiểu dùng tắt ý !!!
			public void name() {
				// TODO Auto-generated method stub
				super.name();
			}
		};
		
		ciao.name();
	}

}

// đây là outer class nha !!!
abstract class XinChao{
	public void name() {
		System.out.println("Kimi no nawa !");
		
	}
}
