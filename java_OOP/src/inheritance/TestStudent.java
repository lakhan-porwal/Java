package inheritance;

public class TestStudent {
	public static void main(String[] args) {
		
		Student A = new Student () ;
				
		A.setRollNo("201030");
		A.setMarks(80);
		
		System.out.println(A.getRollNo());
	    System.out.println(A.getMarks());
	}

}
