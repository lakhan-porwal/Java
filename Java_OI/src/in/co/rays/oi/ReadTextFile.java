package in.co.rays.oi;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
	
	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("C://OI-TextFile//hello.txt");
		
		int i = file.read();
		
		while (i != -1) {
			System.out.println((char) i + " = " + i);
			i = file.read();
			
		}
		file.close();
	}

}
