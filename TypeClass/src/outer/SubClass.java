package outer;

//class kế thừa, tuy nhiên phải cùng package vì nó là default
public class SubClass extends Kid{
public static void main(String[] args) {
	Person p = new Person();
	p.hi();// như bình thường
}
}
