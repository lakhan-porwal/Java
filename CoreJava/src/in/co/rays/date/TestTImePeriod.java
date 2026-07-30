package in.co.rays.date;

import java.time.LocalDate;
import java.time.Period;

public class TestTImePeriod {
	
	public static void main(String[] args) {
		
		LocalDate todayDate = LocalDate.now();
		
		System.out.println( "today's in.co.rays.date ;- " + todayDate);
		
		LocalDate birthDate = LocalDate.of(2007, 11, 15);
		System.out.println("your birthdate :- " + birthDate);
		
		Period period = Period.between(birthDate, todayDate);
		
			System.out.println(period.getYears() + "year " +  period.getMonths() + "month " + period.getDays() +  "days");
	}

}
