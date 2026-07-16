package string;

public class String11 {
	public static void main(String[] args) {
		String src = "abcabc";
		for (int i = 1; i <= src.length() ; i++) {
			
			String sub = src.substring(0,i);
			String repeat = ""; 
			while( repeat.length() < src.length()) {
				repeat = repeat + sub;
				
			}
			if( repeat.equals(src)) {
			System.out.println("Repeated substring : " + sub);
			      break;
			}
		}
	}

}
