package exp;

public class NewException extends Exception {
	private String err;

	// tạo constructor tí dùng
	public NewException(String err) {
		super();
		this.err = err;
	}

	public String getErr() {
		return err;
	}

	public void setErr(String err) {
		this.err = err;
	}

}
