package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {

	public static void main(String[] args) {

		Queue<Integer> q = new PriorityQueue<Integer>();//Queue is an interface but PriorityQueue is not.
		//We cannot create an instance / object from interface. So we are using PriorityQueue. 
		
		//Add elements
		
		for(int i=0; i<5; i++) {
			
			q.add(i);
		}
		
		System.out.println(q);
		
		int removedel = q.remove();
		
		System.out.println(removedel);
		
		System.out.println(q);
		
		System.out.println(q.peek());
		
		
	}

}
