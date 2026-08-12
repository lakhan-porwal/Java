package in.co.rays.exceptio.git;

public class PatentCatchBlock {
	
	public static void main(String[] args) {
		
		String name = "atulBhai";
		
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(3));
			
			
		} catch (Exception e) {
			
			System.out.println("Exception :-" + e.getMessage());
		}finally {
			System.out.println("always execute");
		}
		
	
	}
}
