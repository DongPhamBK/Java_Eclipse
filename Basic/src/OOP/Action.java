package OOP;

public class Action {

	String chay;
	String an;
	String ngu;

	// constructor
	// có tác dụng như mặc định tham số

	public Action() {
		// trống, mặc định
	}

	public Action(String chay) {
		this.chay = chay;
	}

	// constructor đầy đủ !!!
	public Action(String chay, String an, String ngu) {
		this.an = an;
		this.chay = chay;
		this.ngu = ngu;

	}

	// thực ra không cần get and set vẫn được, lí do vì đây là kiểu public 
	public String getChay() {
		return chay;
	}

	public void setChay(String chay) {
		this.chay = chay;
	}

	public String getAn() {
		return an;
	}

	public void setAn(String an) {
		this.an = an;
	}

	public String getNgu() {
		return ngu;
	}

	public void setNgu(String ngu) {
		this.ngu = ngu;
	}

}
