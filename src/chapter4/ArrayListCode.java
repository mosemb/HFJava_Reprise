package chapter4;
import java.util.*;



public class ArrayListCode {
	
	
	public static void main(String [] args) {
		ArrayList<String> lis = new ArrayList<String>();
		lis.add(0, "zero");
		lis.add(1,"one");
		lis.add(2, "two");
		lis.add(3, "three");
		
		printAL(lis);
		
		if(lis.contains("three")) {
			lis.add("four");
		}
		
		printAL(lis);
		lis.remove(2);
		
		if(lis.indexOf("four") != 4 ) {
			
			lis.add(4, "4.2");
		}
		
		printAL(lis);
		
	}
	
	
	
	
	public static void printAL(ArrayList<String> al) {
		
		for (String el : al) {
			
			System.out.print(el + " ");
		}
		
		System.out.println(" ");
	}

}
