package OopsConceptsP2;

public class HSBCBank implements USBank, IndiaBank { // case of multiple inhertance also called Is A Relationship

	
	// Overriding USBank methods
	public void credit() {
		System.out.println("HSBC Credit");
	}

	public void debit() {
		System.out.println("HSBC debit");
	}

	public void transfar_money() {
		System.out.println("Transfar Moeny");
	}

	public void terms_condition() {
		System.out.println("Terms and Condition");
	}

	public void home_loans() {

		System.out.println("home Loans");
	}

	// HSBC own methods
	public void Edu_loans() {
		System.out.println("edu Loans");

	}

	public void Car_loans() {

		System.out.println("Car Loans");

	}

	//overidding india Bank method
	public void MutualFunds() {
		System.out.println("MutualFunds");
	}

}
