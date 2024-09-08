package collectionFramework;

import java.util.*;
public class StackExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stk = new Stack<String>();
		stk.push("jay");
		stk.push("rahul");
		stk.push("vijay");
		stk.push("ram");
		stk.push("sham");
		System.out.println(stk);
		System.out.println(stk.elementAt(0));
		
		System.out.println("Stack elements are: ");
		for(String i : stk)
		{
			System.out.println(i);
		}
		System.out.println("Removing element: "+stk.pop());
	}

}
