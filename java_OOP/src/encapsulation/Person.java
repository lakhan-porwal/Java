package encapsulation;

import java.util.Date;

public class Person {
	
	private String name ;
	private Date dob;
	private String address;
	private String gender;
	public final static int AVG_AGE = 18;
	
	
	public String getName( ) {
		return name;
		
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	public Date getDob() {
		return dob;
		
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public String getAddress( ) {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender( String gender ) {
		this.gender = gender;
	}
	
	//Age Calculate 
	
	public int getAge (Date dob) {
		Date dd = new Date (); ;
		
		int age = dd.getYear() - dob.getYear();
		
		return age;
	}

	public void setDob(String string) {
		
	}

	public void setDateOfBirth(Date date) {
		
	}

	public char[] getDateOfBirth() {
		return null;
	}

	
	}
	
	


