package encapsulation;

public class VoiceCommand {
	
	private Long commandId;
	private String commandCode;
	private String userName ;
	private String commandText ;
	private String status ;
	
	public Long getCommandId () { 
		return commandId; 
	}
	public void setCommandid (Long commandId ) {
		this.commandId = commandId;
	}
	public String getCommandCode () {
		return commandCode;
	}
	public void setCommandCode (String commandCode ) {
		this.commandCode = commandCode;
	}
	public String getUserName () {
		return userName ;
	}
	public void setUserName (String userName ) {
		this.userName = userName ;
	}
	public String getCommandText () { 
		return commandText;
	}
	public void setCommandText (String commandText) {
		this.commandText = commandText;
	}
	public String getstatus () {
		return status ;
	}
	public void setStatus ( String status) {
		this.status = status;
	}

}
