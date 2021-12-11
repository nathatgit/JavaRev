package OopsConceptsP1;

public class WrapperConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "100";
		System.out.println(s + 20);

		int x = Integer.parseInt(s);

		System.out.println(x + 20);

		// INTEGER, BOOLEAN, DOUBLE, CHARECATOR

		// String to double converson

		String ss = "188.22";

		double d1 = Double.parseDouble(ss);

		System.out.println(d1 + 11.88);

		// String to Boolean

		String k = "False";
		boolean bb = Boolean.valueOf(k);
		System.out.println(bb);

		// int to String

		int j = 300;
		String xx = String.valueOf(j);

		System.out.println(xx);
		
		String sss= "100d";
		
		int d= Integer.parseInt(sss); //Number format exception

	}

}
