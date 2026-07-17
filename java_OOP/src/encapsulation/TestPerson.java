package encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Person p = new Person();
		p.setName("Mahendra singh Dhoni");
		p.setAddress("Ranchi");
		p.setDob (sdf.parse("1981-07-07"));
		p.setGender("male");
		
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		System.out.println(sdf.format(p.getDob()));
		System.out.println("p gender : " + p.getGender());
		System.out.println("p age : " + p.getAge(p.getDob()));
		
	}

}
