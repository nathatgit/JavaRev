package OopsConceptsP1;

public class FunctionInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionInJava func = new FunctionInJava();
		/*
		 * Here, we are creating an object of the class (functioninJava) and func is
		 * object referernce. by doing this, copy of all non-static method will be given
		 * to our object.
		 */

		func.test();

		double c = func.passInput(87, 2.4);

		System.out.println("the final value is :" + c);

	}

	// Non static Function

	public void test() {

		System.out.println("Test Method");
	}

	public int num() {

		// System.out.println("Number method");
		int a = 1;
		int b = 5;
		int c = a + b;

		return c;

	}

	public String str() {
		String S = "String Method";
		System.out.println("str method");
		return S;
	}

	public double passInput(int a, double b) // a, b are input varibales/arguments
	{
		double c = a / b;
		System.out.println("Division method");

		return c;
	}

}