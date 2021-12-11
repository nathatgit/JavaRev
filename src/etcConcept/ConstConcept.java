package etcConcept;

public class ConstConcept {

	public ConstConcept() {

		System.out.println("DefaultConst");

	}

	public ConstConcept(int i) {

		System.out.println("Single Param Const");
		System.out.println("Value of i:" + i);

	}

	public ConstConcept(int i, int j) {

		System.out.println("Double Param Const");
		System.out.println("Value of i:" + i + "\n" + "Value of j:" + j);

	}

	public static void main(String[] args) {
		
		ConstConcept c1 = new ConstConcept();
		ConstConcept c2 = new ConstConcept(10);
		ConstConcept c3 = new ConstConcept(10, 33);


	}

}
