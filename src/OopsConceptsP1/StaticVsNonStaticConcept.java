package OopsConceptsP1;

public class StaticVsNonStaticConcept {

	static String s = "Mail Opening";
	static int i = 25;
	double d = 6.8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Calling Static variable / funcion directly

		System.out.println(s);
		System.out.println(i);
		newmail();
		System.out.println(newmail());

		// Calling Static variable / funcion By Using ClassName

		System.out.println(StaticVsNonStaticConcept.s);
		System.out.println(StaticVsNonStaticConcept.i);
		StaticVsNonStaticConcept.newmail();
		System.out.print(StaticVsNonStaticConcept.newmail());

		// Calling NonStatic Method by creating object.

		StaticVsNonStaticConcept obj = new StaticVsNonStaticConcept();

		System.out.println("\n" + obj.d);
		System.out.println(obj.newsalary());

		obj.newmail();// Via Object you can call static mthods/variable with one warning sign as its
						// not advisable
		System.out.println(obj.s);
	}

	public static String newmail() {
		System.out.println("New Mail arrived");
		return s;
	}

	public int newsalary() {
		int sal = 8782888;

		return sal;

	}
}
