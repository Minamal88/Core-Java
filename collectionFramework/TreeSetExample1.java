package collectionFramework;
import java.util.*;
public class TreeSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> num = new TreeSet<Integer>();
		num.add(43);
		num.add(91);
		num.add(28);
		num.add(51);
		//num.add(43);
		
		Iterator<Integer> values = num.iterator();
		while(values.hasNext())
		{
			System.out.println(values.next());
		}
		/*
		 * for(int i : num) { System.out.println(i); }
		 */
	}

}
