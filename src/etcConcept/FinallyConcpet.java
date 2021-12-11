package etcConcept;

public class FinallyConcpet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// testmethod2();

		//divison();  
		
		multiply();
	}

	public static void testmethod2() {
		try {
			System.out.println("Try This");

		} catch (Exception e) {
			System.out.println("catch this");
		}

		finally {
			System.out.println("Finally");
		}

	}

	public static void divison() {
		final int i = 0;

		try {
			int k = 10 * i;

			System.out.println("Inside try block");
		}

		catch (ArithmeticException e) {
			System.out.println("Inside catch block" + "\n" + "Divide by Zero");

		}

		finally {
			System.out.println("print this even if there is any exception ");
		}

	}
	
	public static void multiply() {
		final int i = 0;

		try {
			int k = 1/i;

			System.out.println("Inside try block");
		}

		catch (NullPointerException e) {
			System.out.println("Inside catch block" + "\n" + "Divide by Zero");

		}

		finally {
			System.out.println("print this even if there is any exception ");
		}

	}

}
