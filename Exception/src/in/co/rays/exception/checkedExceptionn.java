package in.co.rays.exception;

public class checkedExceptionn {
	
	public static void main(String[] args) {
		
		try {
			dad();
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}

	private static void dad() throws Exception {
		Mom();
	
		// TODO Auto-generated method stub
		
	}

	private static void Mom() throws Exception {
		Son ();
		
		// TODO Auto-generated method stub
		
	}

	private static void Son() throws Exception {
		throw new Exception ("make a mistake");
		// TODO Auto-generated method stub
		
	}

}
