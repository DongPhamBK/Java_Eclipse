package animal;

public class Person {
public String ten;
public void thongTin()
{
	this.ten = "Nam";
	//super.ten  = "Minh";
	// this trỏ đến chính đối tượng của nó trong nó
	System.out.println("Tên : " + this.ten);
}
}
