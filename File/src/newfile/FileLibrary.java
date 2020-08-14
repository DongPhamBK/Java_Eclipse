package newfile;

import java.io.*;

public class FileLibrary {
	public static void main(String[] args) throws IOException {

		File di = new File("hello");
		if (di.exists()) {
			di.mkdir();// tạo thư mục, như command luôn !
		}

		File a = new File("hello/reborn.txt");
		if (!a.exists()) {
			a.createNewFile();// nếu chưa có thì tạo !
		}
		FileReader areader = new FileReader(a);

		int c = areader.read();

		while (c != -1) {
			System.out.print((char) c);
			c = areader.read();
		}
		areader.close();

		// hết đọc rồi lại ghi !!
		String s = "Ghi vào !";
		FileWriter gh = new FileWriter(a);// lẽ ra nên đặt tên biến là file
		gh.write(s);
		gh.close();// đừng quên !!!
	}
}
