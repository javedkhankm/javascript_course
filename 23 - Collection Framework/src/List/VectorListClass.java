package List;

import java.util.Vector;

public class VectorListClass {

	public static void main(String[] args) {
		
		//Vector has an initial size of 10, and the increase capacity is 100%.
		//ArrayList has an initial size of 10, and the increase capacity is 50%.
		//Vector is slow and not good to use.
		//In interview if asked about vector, say that its not recommended to use because it is slow. So
		//I have never used it. However, I know the basics and just tell the above things.
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(8);
		v.add(9);
		v.add(10);
		
		v.add(2);
		
		
		System.out.println(v.capacity()); //capacity is the elements storage capacity or in terms of Arrays
		//its a size.

	}

}
