package collectionFramework;
import java.util.*;
public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> students = new HashMap<String,Integer>();
		students.put("john",72);
		students.put("sahil", 67);
		students.put("ram", 88);
		students.put("shyam", 97);
		students.put("rani", 54);
		//0students.put("sahil", 32);

		
		//System.out.println(students);
		
		for(String key : students.keySet())
		{
			System.out.println(key+" : "+students.get(key));
		}
		System.out.println(students.get("rani"));
	}

}
