package collectionFramework;

import java.util.*;
public class QueueExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue = new PriorityQueue<String>();
		//System.out.println(queue.element());
		System.out.println("Queue is empty? "+queue.isEmpty());
		System.out.println(queue.peek());
		queue.add("raj");
		queue.add("vijay");
		queue.add("rahul");
		queue.add("jay");
		queue.add("john");
		System.out.println("Queue elements are: "+queue);
		System.out.println("Head element using element(): "+queue.element());
		System.out.println("Head element using peek(): "+queue.peek());
		Iterator<String> values = queue.iterator();
		System.out.println("Elements are: ");
		while(values.hasNext())
		{
			System.out.println(values.next());
		}
		System.out.println("Removing elements in the queue: "+queue.remove());
		System.out.println(queue.poll());
		System.out.println("Queue is empty? "+queue.isEmpty());
	}

}
