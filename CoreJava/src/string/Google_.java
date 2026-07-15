package string;

public class Google_ {
	public static void main(String[] args) {
	   
		String str = "Google";
		System.out.println(str);
		System.out.println("string lenght -" + str.length());
		int count = 0;
	
		char c = 'o';
		
		for(int i = 0; i < str.length(); i++) {
			if(c==str.charAt(i)) {
				count++;
				
				
			}
		}
		System.out.println("o = " + count);
	}
}
