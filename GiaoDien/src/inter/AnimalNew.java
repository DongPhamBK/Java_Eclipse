package inter;

// từ khoá implements để kế thừa
public class AnimalNew implements Animal {

	// phải override
	@Override
	public void cat() {
		System.out.println("Meo Meo!");
	}

	@Override
	public void dog() {
		int a = 0;
	}

}