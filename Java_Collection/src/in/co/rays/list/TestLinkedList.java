package in.co.rays.list;

import java.util.LinkedList;

public class TestLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();	
		
		list.add("ram");
		list.add(6);
		list.add("sita");
		
		System.out.println(list);
		
		System.out.println(list.remove(2));
		System.out.println(list);
		list.add("sita");
		
	}

}
