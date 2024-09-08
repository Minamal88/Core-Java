package classesAndObjects;

class Student1
{
	int roll;
	String name;
	void get()
	{
		roll=101;
		name="John";
	}
	void put()
	{
		System.out.println(roll+"\t"+name);
		
	}
}
public class TestStudent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s=new Student1();
		
		s.get();
		s.put();

	}

}
