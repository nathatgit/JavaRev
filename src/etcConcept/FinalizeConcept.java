package etcConcept;

public class FinalizeConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalizeConcept f1 = new FinalizeConcept();
		
		f1 = null;
		
		//System.out.println("Garbage collector method");
		
		System.gc();

	}
	
	
	public void finalize()
	{
		int i =10;
		System.out.println("Finalize method");
		
		System.out.println(i+10);
		
	}
}
