package collectionFramework;

import java.util.*;

public class HashTableExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> students = new Hashtable<String,Integer>();
		students.put("john",72);
		students.put("sahil", 67);
		students.put("ram", 88);
		students.put("shyam", 97);
		students.put("rani", 54);
		students.put("sahil",null);

		
		System.out.println(students);
	}

}
