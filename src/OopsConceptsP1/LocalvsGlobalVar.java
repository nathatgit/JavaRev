package OopsConceptsP1;

public class LocalvsGlobalVar {

	static String s1 = "Wanda"; // Global Variable, can be access in main method via creatig obj. available
						// throughout.
	int age = 32;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Wanda"; // Local Varibale to main method, Available in main method only.

		LocalvsGlobalVar Lvg = new LocalvsGlobalVar();
		System.out.println(s + "'s age is :" + Lvg.age);
System.out.println(s1);
		System.out.println(s + Lvg.ageVision());

	}

	public String ageVision() {
		int age = 6;
		String s = "Vision";
		// Local Varibales , Availble in this method only , cant access in main method

		System.out.println(s + "'s age is :" + age);
		return s;

	}

}
