
public class VongLapFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// các kiểu của for
		for (int i = 0; i < 5; i++)
			System.out.println(i);

		int j = 0;
		for (; j < 8;) // dạng thiếu
		{
			System.out.println(j);
			j++;// v
		}
		/***************
		 * FOR EACH
		 **************/
		
		int x[] = {2,3,4,5,67,54,67,3};
		
		for(int i : x)//về bản chất, là lấy từng giá trị của mảng
		{
			System.out.println(i);
		}
		
		char name[] = {'a','4','g','w'};
		for(char a:name)
		{
			System.out.println(a + "**");
		}
	}

}