package OopsConceptsP1;

public class Human {

	// Class varibales

	String name;
	int age;
	String place;
	int ID;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// new Human() represent object and H is object reference that hold that object

		Human H1 = new Human();
		Human H2 = new Human();
		Human H3 = new Human();

		H1.age = 12;
		H1.name = "Aditya Sharma";
		H1.place = "New Delhi";
		H1.ID = 12119;

		H2.age = 32;
		H2.name = "Mr Mahaveer Singh";
		H2.place = "Gurugram";
		H2.ID = 321319;

		H3.age = 22;
		H3.name = "Ms Mona Singh";
		H3.place = "Jaipur";
		H3.ID = -221319;

		System.out.println("Before assigning values ");

		System.out.println(H1.age);
		System.out.println(H1.ID);
		System.out.println(H1.name);
		System.out.println(H1.place);

		System.out.println(H2.age);
		System.out.println(H2.ID);
		System.out.println(H2.name);
		System.out.println(H2.place);

		System.out.println(H3.age);
		System.out.println(H3.ID);
		System.out.println(H3.name);
		System.out.println(H3.place);

		System.out.println("After assigning values ");

		H1 = H2;
		H2 = H3;
		H3 = H1;

		System.out.println(H1.age);
		H1.age = 21;
		System.out.println(H1.age);

	}

}
