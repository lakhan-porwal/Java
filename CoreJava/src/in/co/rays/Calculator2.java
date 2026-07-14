package in.co.rays;

public class Calculator2 {
	public static void main(String[] args) {
		String opr = "/";
		int a = 2010;
		int b = 30;
		switch (opr) {
		case "+":
			System.out.println("Result"+ (a+b));
		case "-":
			System.out.println("Result"+ (a-b));
		case "*":
			System.out.println("Result"+ (a*b));
		case "/":
			System.out.println("Result"+ (a/b));
		}
	}

}
