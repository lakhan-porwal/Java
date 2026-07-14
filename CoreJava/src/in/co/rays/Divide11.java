package in.co.rays;

public class Divide11 { 
	public static void main(String[] args) {
		 
		int num = 14;
		int steps = 0;
		while (num != 0) {
			
			//System.out.println(num);
			
			if ( num % 2 == 0) {
				num = num/2;
				steps++;
				
 		 	} else {
				num = num - 1;
				steps++;
			}
		} System.out.println(steps);
	}
}
