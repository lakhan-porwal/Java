package string;

public class LargestSubString {
	
	public static void main(String[] args) {
		
		String str = "abcdefabcde";
		String longest = " " ;
		
		for (int i = 0; i <= str.length(); i++) {
			
			for (int j = i + 1 ; j <= str.length(); j++) {
				
				 String sub = str.substring(i, j);
				 
				 if (str.indexOf(sub) !=  str.lastIndexOf(sub)) {
					 
				 
				 if (sub.length()> longest.length()) {
					    longest = sub ;
					    
				 }
			}
		}
		
	}
		System.out.println("longest SubString: " + longest);
		System.out.println("longest length : " + longest.length());
		System.out.println("String lenght : " + str.length());
}

}