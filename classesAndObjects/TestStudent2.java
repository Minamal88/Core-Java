package classesAndObjects;

class Student2
{
	int roll;
	String name;
	void get(int r,String n)
	{
		roll=r;
		name=n;
	}
	void put() {
		System.out.println(roll+"\t"+name);
	}
}
public class TestStudent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s=new Student2();
		Student2 s1=new Student2();
		s.get(101, "John");
		s.put();
		s1.get(102, "peter");
		s1.put();
	}

}
