package in.co.rays.oi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferReadTextFile {

	public static void main(String[] args) throws Exception {

		BufferedReader file = new BufferedReader(new FileReader("C://OI-TextFile//hello.txt"));

		String line = file.readLine();

		while (line != null) {
			System.out.println(line);
			line = file.readLine();

		}
		file.close();

	}

}
