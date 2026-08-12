package in.co.rays.exception;

public class UncheckedExceptionn {
	
	  public static void main(String[] args) {
		
		  try {
			
			  dad();
			  
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		  
	}

	private static void dad() {
		mom ();
		
		// TODO Auto-generated method stub
		
	}

	private static void mom() {
		Son ();
		
		// TODO Auto-generated method stub
		
	}

	private static void Son() {
		throw new RuntimeException("make a mistake");
		
		// TODO Auto-generated method stub
		
	}

}
