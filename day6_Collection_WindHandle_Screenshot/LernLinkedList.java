package oct22.day6_Collection_WindHandle_Screenshot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LernLinkedList {

	public static void main(String[] args) {
		List listValues = new LinkedList();
		
		System.out.println("Before addition: " + listValues.size());
		
		listValues.add("Nur");
		listValues.add("Faisal");
		listValues.add("Ami");
		listValues.add("Amisha");
		listValues.add("Ritu");
		listValues.add("Sudhakar");
		boolean list = listValues.add("Nur");
		
		System.out.println(list);
		
		System.out.println("After addition: " + listValues.size());
		
		/*
		 * for (int i=2; i<listValues.size(); i++) {
		 * System.out.println(listValues.get(i)); }
		 */

		//foreach Ctrl+space+enter
		//foreach Sysntax : for (Object temporaryVariable : VariableName)
		
		listValues.add("Raj");
		System.out.println("After Insertion: " + listValues.size());
		listValues.remove(3);
		System.out.println("After Removal: " + listValues.size());
		
		for (Object printListValues: listValues) {
			System.out.println(printListValues);
		}
		
		//Ascending order
		//Collections
		Collections.sort(listValues);
		System.out.println(listValues);
		
		//Descending order
		
		for (int i=listValues.size()-1; i>=0; i--) 
		{
			System.out.println("Descending Order :" +listValues.get(i));
	
	}
		System.out.println(listValues);
	}
	
	


}
