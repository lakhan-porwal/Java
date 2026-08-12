package in.co.rays.list;

import java.util.ArrayList;
import java.util.List;

public class TestArray {
	
	public static void main(String [] args) {
		
		List list = new ArrayList();
		
		list.add(0, "Ram");
		list.add(1, "vivek");
		list.add(2,23);
		list.add(3, "Ram");
		list.add(4,"sita");
		
		
		System.out.println(list);
		System.out.println(list.get(3));
		
		System.out.println(list.remove(4));
		System.out.println(list);
		
		System.out.println(list.set(0, "Sachin"));
		System.out.println(list);
		
		System.out.println(list.indexOf("vivek"));
		System.out.println(list.lastIndexOf(23));
		System.out.println(list.subList(0, 3));
		
		list.add(4,"rohit");
		list.add(5, "Ram");
		list.add(6, "Lakhan");
		list.add(7, "Sita");
		
		System.out.println(list);
		System.err.println(list.set(0, "Ram"));
		System.out.println(list);
	}

}
