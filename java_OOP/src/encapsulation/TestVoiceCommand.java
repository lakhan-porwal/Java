package encapsulation;

public class TestVoiceCommand {
	public static void main(String[] args) {
		
	VoiceCommand a = new VoiceCommand ();
		
		a.setCommandid(25412155421545121L);
		a.setCommandCode("SunRays");
		a.setUserName("Rays");
		a.setCommandText("hello");
		a.setStatus("Java");
		
		
		System.out.println(a.getCommandId());
		System.out.println(a.getCommandCode());
		System.out.println(a.getUserName());
		System.out.println(a.getCommandText());
		System.out.println(a.getstatus());
	}

}
