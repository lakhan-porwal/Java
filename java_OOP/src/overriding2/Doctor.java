package overriding2;

public class Doctor  extends Person110 {
	
		@Override 
		public String getName () {
			return "Dr arun";
		}
	
	@Override
	public int getRegistrationNo () {
		return 10;
	}
	

}
