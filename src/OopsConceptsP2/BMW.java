package OopsConceptsP2;

public class BMW extends Car  { 	//has a relationship 

	public void carStart()
	// when same method is present in child as well as in parent class with same
	// name and same no of argument then Java compiler gives preference to child
	// class, this concept is called as method overridding, preference will be given to override method.
	{
		System.out.println("BMW---Car---Start");
	} 

	public void Safety() {
		System.out.println("CarSafety");
	}

}
