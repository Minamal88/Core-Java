package collectionFramework;
import java.util.*;
public class HashSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> num = new HashSet<Integer>();
		num.add(43);
		num.add(91);
		num.add(28);
		num.add(51);
		num.add(43);
		//num.add("h");
		
		for(int i : num)
		{
			System.out.println(i);
		}
		
	}

}
