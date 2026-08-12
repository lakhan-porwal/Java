package in.co.rays.exception;

public class CheckedException {
	
	public static void main(String[] args) {
		dad();
	}

	private static void dad() {
		try {
			mom();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}
		// TODO Auto-generated method stub
		
	}

	private static void mom() throws Exception {
		son();
		// TODO Auto-generated method stub
		
	}

	private static void son() throws Exception {
		throw new Exception("make a mistake");
		// TODO Auto-generated method stub
		
	}

}
