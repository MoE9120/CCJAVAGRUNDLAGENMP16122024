package oop_thema7_datenstrukturen.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class ArrayListProgramm {
 
	public static void main(String[] args) {
		
		// FIFO: First in first out
		List<String> list= new ArrayList<String>();
//		list.add("A");
//		list.add("B");
//		list.add("C");
//		list.add("D");
//	
		list = Arrays.asList("A", "B", "C", "D");
		System.out.println(list.get(2));
//		System.out.println(list);
	}
}