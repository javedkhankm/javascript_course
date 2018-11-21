package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {

		List <Integer> values  = new ArrayList <Integer>();
		
		values.add(5);//5 at index 0
		values.add(10);//10 at index 2
		values.add(1,9);// this means we want to add 9 at index 1
		values.add(2);
		
		Collections.sort(values);
		
		System.out.println(values);
		
		for(int i : values) {
			
			System.out.println(i);
		}
		
		
	}

}
