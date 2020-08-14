package wrapper;

import java.util.Calendar;
import java.util.Date;

public class DateTime {
public static void main(String[] args) {
	Date ngay  =  new Date();// hay vãi
	System.out.println(ngay);
	
	Date ngay2  =  new Date();// khai báo sau thôi cũng hỏng hết !!!
	System.out.println(ngay.equals(ngay2));
	
	System.out.println(ngay2.getTime());
	
	Calendar ca = Calendar.getInstance();
	System.out.println(ca);
	System.out.println(ca.getTime());
	ca.add(Calendar.DATE, 3);// trừ ngày
	System.out.println(ca.getGreatestMinimum(5));
}
}
