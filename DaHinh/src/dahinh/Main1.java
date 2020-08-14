package dahinh;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ------------------------
		Person aa = new Worker();
		Employee bb = new Worker();
		Object cc = new Worker();// đa hình nhé !!!
		// aa.ngatLamViec();//giờ chưa được

		Worker temp = (Worker) aa;// ép kiểu, giống như int a = (int) b
		temp.ngayLamViec();

		((Worker) bb).ngayLamViec();// chơi tắt !!!

		((Employee) cc).toString();// ép đủ kiểu thấp hơn hay cao hơn !!!
	}

}
