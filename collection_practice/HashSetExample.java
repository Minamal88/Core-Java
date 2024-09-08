package collection_practice;
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s = new HashSet<Integer>();
		Set<Integer> s1 = new HashSet<Integer>();
		//Set<Integer> s = new TreeSet<Integer>();
		//Set<Integer>s1 = new TreeSet<Integer>();
		s.add(63);
		s.add(51);
		s.add(29);
		s.add(46);
		s1.add(63);
		s1.add(51);
		s1.add(29);
		s1.add(46);
		/*s1.add(36);
		s1.add(15);
		s1.add(92);
		s1.add(54);*/
		System.out.println(s);
		System.out.println(s.equals(s1));
	}

}
