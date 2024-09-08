package collectionFramework;
import java.util.*;
public class ArrayListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(5);
		num.add(7);
		num.add(4);
		num.add(9);
		num.add(7);
		//num.add("6");
		System.out.println("Index of number: "+num.get(2));
		System.out.println("Number of index: "+num.indexOf(4));
		//System.out.println(num);
		for(int n : num)
		{
			System.out.println(n);
		}
	}

}
