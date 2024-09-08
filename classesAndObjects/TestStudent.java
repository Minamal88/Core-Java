package classesAndObjects;
class Student
{
	int roll;	//instance or class variables
	String name;
}

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		//s.roll=101;
		//s.name="john";
		System.out.println(s.roll);	//0
		System.out.println(s.name);	//null
	}

}
