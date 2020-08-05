package company;

public class NhanVien {
	private String ten;
	private String tuoi;
	private String nha;
	//constructor
	public NhanVien(){
		
	}
	
	public NhanVien(String ten, String tuoi, String nha){
		this.nha = nha;
		this.ten = ten;
		this.tuoi = tuoi;
	}
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getTuoi() {
		return tuoi;
	}
	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	public String getNha() {
		return nha;
	}
	public void setNha(String nha) {
		this.nha = nha;
	}
	

}
