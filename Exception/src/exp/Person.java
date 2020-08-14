package exp;

import javax.management.InstanceAlreadyExistsException;

public class Person {
	public static void prin() throws ArrayIndexOutOfBoundsException {
		int[] a = { 1, 2 };

		System.out.println(a[2]);
	}

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {

		// prin();

		// System.out.println("lỗi");
		try {
			excep();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("lỗi");
		}

	}

	// tạo mới exception
	public static void excep() {
		throw new ArrayIndexOutOfBoundsException();
	}
	
	// lại là một kiểu tạo mới !
	public static void excep1() throws InstanceAlreadyExistsException{
		throw new InstanceAlreadyExistsException();
		// không throws thì try-catch
	}
}
