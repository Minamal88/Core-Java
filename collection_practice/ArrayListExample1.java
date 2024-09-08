package collection_practice;
import java.util.*;
public class ArrayListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<>();
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(9);
		System.out.println("Element of perticular position: "+a.get(0));
		System.out.println("Position of perticular number: "+a.indexOf(7));
		System.out.println("Size of array list: "+a.size());
		System.out.println(a.set(0, 8));
		System.out.println(a.remove(3));
		
		/*for(int n: a)
		{
			System.out.println(n);
		}*/
		
	}

}
