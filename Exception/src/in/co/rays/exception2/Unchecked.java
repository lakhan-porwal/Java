package in.co.rays.exception2;

public class Unchecked {
	
	public static void main(String[] args) {
		
	try {
		dad();
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
		// TODO: handle exception
	}
		
		
	}

	private static void dad() {
		mom();
		// TODO Auto-generated method stub
		
	}

	private static void mom() {
		son();
		// TODO Auto-generated method stub
		
	}

	private static void son() {
		throw new RuntimeException("make a mistake");
		// TODO Auto-generated method stub
		
	}

}
