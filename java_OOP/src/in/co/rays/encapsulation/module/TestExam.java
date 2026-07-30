package in.co.rays.encapsulation.module;

import java.text.SimpleDateFormat;

public class TestExam {
	
	public static void main(String[] args) throws Exception {
		
		Exam e = new Exam ();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		
		e.setExamId(1201);
		e.setExamName("Mp Board");
		
        e.setExamDate(sdf.parse("02-02-2027"));
		
		e.setTotalMarks(80);
		e.setPassingMarks(28);
		
		System.out.println(e.getExamId());
		System.out.println(e.getExamName());
		
		System.out.println(e.getExamDate());
		
		System.out.println(e.getTotalMarks());
		System.out.println(e.getPassingMarks());
		
	}

}
