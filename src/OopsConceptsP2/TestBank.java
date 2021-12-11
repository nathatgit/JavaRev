package OopsConceptsP2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//USBank b = new USBank();
		
		// if a class is implementing any interface then its mandetory to define all methods of the Interface.
		
		HSBCBank hs= new HSBCBank();

		System.out.println(USBank.min_bal);
		hs.Car_loans();
		hs.credit();
		hs.debit();
		hs.Edu_loans();
		hs.home_loans();
		hs.transfar_money();
		
// dynamic polymorphism 
		// a child class object can be refer by its parent interface variables. 
		USBank ub = new HSBCBank();
		System.out.println(IndiaBank.min_bal);

		ub.credit();
		ub.debit();
		ub.terms_condition();
		ub.transfar_money();
	}

	}
