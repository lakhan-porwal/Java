package overriding2;

public class TestPerson110 {
	
	public static void main(String[] args) {
		
		Person110 p1 = new BusinessMan ();
		
		System.out.println(p1.getName());
		System.out.println(p1.getIncome());
		
		
		
		System.out.println("............");
		
		
		
		
		Person110 p2 = new Doctor() ;
		
		System.out.println(p2.getName());
		System.out.println(p2.getRegistrationNo());
		
		
		System.out.println("............");
		
		
		Person110 p3 = new Student ();
		
		
		System.out.println(p3.getRollNo());
		System.out.println(p3.getMarks());
		
	}

}
