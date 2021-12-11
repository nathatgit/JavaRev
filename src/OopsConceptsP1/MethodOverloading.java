package OopsConceptsP1;

public class MethodOverloading {

	public static void main(String[] nn) {

		MethodOverloading MO = new MethodOverloading();
		// Method Overloading :- when method name is same of 2 or more methods in same
		// class but with differnt input parameters/arguments or differnt datatype argument then this concept is
		// called method overloading
		String[] s2 = new String[2];
		// TODO Auto-generated method stub

		s2[0] = "Captain America V";
		s2[1] = "S Iron Man";

		MO.method();
		MO.method(s2[0]);
		MO.method(s2[1]);

		MO.method(s2[1], 'o');
		

	}
	
	public static void main (int x , int c) {
		System.out.println("Main method overload you biyach ");
	}
	public static void main (char c) {
		System.out.println("Main method overload again you biyach ");
	}
	
	// Main method can be overload if you pass different parameters

	public void method() {
		System.out.println("Zemo Param");
	}

	public void method(String s) {
		System.out.print(s);
	}

	public void method(String s, char s2) {

		System.out.println();

	}
	public void method(String s, char s2, int c) {

		System.out.println(s2);

	}

}
