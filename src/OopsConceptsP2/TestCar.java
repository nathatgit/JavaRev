package OopsConceptsP2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Static polymorphism or compile time polymorphism
		BMW b = new BMW();
		b.carStart(); // from bmw class
		b.carStop(); // from car class
		b.carRefuel(); // from car class
		b.Safety(); // bmw class
		b.engine();//From Vehicle Class

		System.out.println("**********************************");

		Car c = new Car();
		{
			c.carStart();
			c.carStop();
			c.carRefuel();
			c.engine();
			

			
		}

		System.out.println("**********************************");
		

		Car c1 = new BMW(); // When a child class object is refer by its parent class object variable then
							// its called dynamic polymorohism or run time polymorphism. in this only common
							// method including overriden method can be accessed. along with its parent
							// class methods. Also called TOP casting
		{
			c1.carStart();

			c1.carStop();

			c1.carRefuel();

			//

		}

	}

}
