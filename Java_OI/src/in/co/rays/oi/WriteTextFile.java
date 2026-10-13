package in.co.rays.oi;

import java.io.FileWriter;

public class WriteTextFile {
	
	public static void main (String [] args) throws Exception {
		
		FileWriter file = new FileWriter("C://OI-TextFile//lakhan.txt", true);
		
		file.write("Hello lakhan");
		
		System.out.println("text data write successfully");
		
		file.close();
	}
	

}
