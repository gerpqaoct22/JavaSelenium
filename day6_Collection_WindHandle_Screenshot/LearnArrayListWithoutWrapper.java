package oct22.day6_Collection_WindHandle_Screenshot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnArrayListWithoutWrapper {

	public static void main(String[] args) {
		List listValues = new ArrayList();
		
		System.out.println("Before addition: " + listValues.size());
		
		listValues.add("Nur");
		listValues.add(100);
		listValues.add(true);
		listValues.add(100.01);
		listValues.add(1000000000L);
		listValues.add('C');
		boolean list = listValues.add(100.02f);
		
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
		/*Collections.sort(listValues);
		System.out.println(listValues);*/
		
		//Descending order
		
		for (int i=listValues.size()-1; i>=0; i--) 
		{
			System.out.println("Descending Order :" +listValues.get(i));
	
	}
		System.out.println(listValues);
	}
	
	

}

