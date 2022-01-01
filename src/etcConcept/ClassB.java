package etcConcept;

public class ClassB extends ClassA {

	public ClassB(int j) {
		super(j);
		System.out.println("Child Class const and value of j is now " + j);
	}

	public ClassB() {
		super();
		System.out.println("Child Class const");
	}

	public ClassB(int j, int i) {
		super(i, j);
		System.out.println("Child Class const and value of j is now " + j);
		System.out.println("Child Class const and value of i is now " + i);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassB b1 = new ClassB(19);

		ClassB b2 = new ClassB();

		ClassB b3 = new ClassB(19, 33);

	}

}
