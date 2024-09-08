package constructor;

class person
{
	person()			//constructor overloading
	{
		int id=10;
		String name="john";
		System.out.println(id+"\t"+name);
	}
	person(int a,double b)	//parameterized constructor
	{
		System.out.println(a+"\t"+b);
	}
}
public class Constructor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p1=new person();
		person p=new person(10,20.22);
	}

}
