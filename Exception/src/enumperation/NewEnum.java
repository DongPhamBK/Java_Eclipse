package enumperation;

// tạo enum
public enum NewEnum {
	 TEN("VINH"), TEN1("NAM");// phải khai báo trước, nếu không sẽ lỗi
// đây chính là enum
	private String name;

   // đổi constructor thành private
	private NewEnum(String name) {

		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
