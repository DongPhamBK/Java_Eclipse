package is_has;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em = new Employee();
		em.setTen("A");
		em.setDiaChi(null);//từ từ mem
		
		DiaChi dia = new DiaChi();
		dia.setTenDuong("Ha Noi");
		em.setDiaChi(dia);
		
		System.out.println("Ten "+ em.getTen());//đơn giản rồi nhé
		System.out.println("Địa chỉ "+ em.getDiaChi().getTenDuong());//đi lần lượt
	}

}