package classesAndObjects;
import java.util.*;
class Student3
{
	int roll;
	String name;
	void get(int r,String n)
	{
		roll=r;
		name=n;
	}
	void put()
	{
		System.out.println(roll+"\t"+name);
	}
}
public class TestStudent3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r1;
		String n1;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter name=");
		n1=s.nextLine();
		System.out.println("Enter roll=");
		r1=s.nextInt();
		Student3 s1=new Student3();
		s1.get(r1, n1);
		s1.put();
	}

}

//Find area of rectangle by using class methods
