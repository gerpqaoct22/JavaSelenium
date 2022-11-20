package oct22.day6_Collection_WindHandle_Screenshot;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {

	public static void main(String[] args) {
		
		Set setValues = new LinkedHashSet<String>();
		
		System.out.println(setValues.size());
		
		setValues.add("Nur");
		setValues.add("Faisal");
		setValues.add("Ami");
		setValues.add("Amisha");
		setValues.add("Ritu");
		setValues.add("Sudhakar");
		boolean printListValues = setValues.add("Nur");
		
		System.out.println(printListValues);
		System.out.println(setValues.size());
		
		for (Object temporarySetValues : setValues) {
			System.out.println(temporarySetValues);
			
		}
		
		setValues.remove("Amisha");
		
		System.out.println(setValues.size());
		for (Object temporarySetValues : setValues) {
			System.out.println(temporarySetValues);
			
		}
	}

}
