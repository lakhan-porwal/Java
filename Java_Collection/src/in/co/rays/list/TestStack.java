package in.co.rays.list;

import java.nio.file.spi.FileSystemProvider;
import java.util.Stack;

public class TestStack {
	
	public static void main(String [] args) {
		
		Stack s = new Stack();
		
		for (char c = 'a'; c <= 'z'; c++) {
			s.push(c);
		}
		System.out.println(s);
		System.out.println(s.peek());
		
		System.out.println(s);
		//System.out.println(s.pop());
		System.out.println(s);
		s.add(25,"z");
		System.out.println(s.lastElement());
		
	}

}
