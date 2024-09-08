package collectionFramework;

import java.util.*;
public class DequeExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> deque = new ArrayDeque<String>();
		deque.add("raj");
		deque.addFirst("vijay");
		deque.addLast("john");
		System.out.println(deque);
		System.out.println(deque.removeFirst());
		System.out.println(deque.peekLast());
		System.out.println(deque.pollLast());
	}

}
