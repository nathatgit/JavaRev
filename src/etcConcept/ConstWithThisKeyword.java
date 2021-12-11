package etcConcept;

public class ConstWithThisKeyword {
	
	int age;
	String name;
	
	public ConstWithThisKeyword(int age, String name)
	{
		this.age= age;
		this.name= name;
		
		System.out.println(age + name );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstWithThisKeyword obj = new ConstWithThisKeyword(10,"Tom");
		

	}

}
