package exp;

public class None {
public static void main(String[] args) {
	//chia2So(1, 2);//không thể đứng 1 mình, bắt buộc try catch
	try {
		chia2So(1, 0);
	} catch (NewException e) {
		//System.out.println(e);
		System.out.println(e.getErr());// vi diệu
	}
}

public static void chia2So(int a, int b) throws NewException {
	try{
	int c  = a/b;// lỗi nếu chia cho 0
	System.out.println(c);
}catch(Exception e){
	throw new NewException("Lỗi chia cho 0");// dùng constructor
}
	}
}
