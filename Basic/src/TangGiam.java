
public class TangGiam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 9;
		i++;
		K(i);
		i--;
		K(i);
		--i;
		K(i);
		++i;
		K(i++);// in ra i rồi mới tăng
		K(++i);// khá lằng nhằng
		/*
		 * b = ++i: tăng rồi gán a = i++: gán rồi tăng
		 */
	}

	public static void K(int i) {
		System.out.println(i);
	}

}
