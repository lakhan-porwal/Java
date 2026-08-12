package in.co.rays.exception;

public class TestLoginn {
	
	public static void main(String[] args) {
		
		String login = "porwallakhan369@gmail.com";
		
		if (login == "porwallakhan368@gail.com") {
			System.out.println("login successfully ");
		}else {
			throw new LoginException();
			
		}
			
	}

}
