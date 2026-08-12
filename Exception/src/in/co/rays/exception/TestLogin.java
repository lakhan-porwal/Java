package in.co.rays.exception;

public class TestLogin {
	public static void main(String[] args) {
		
		String login = "abc@gmail.com";

		if (login == "abc123@gmail.com") {
			System.out.println("User Login");
		} else {
			throw new LoginException();
		}

	}
	}


