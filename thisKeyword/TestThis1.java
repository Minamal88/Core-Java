package thisKeyword;
//whenever the name of instance variable and local variable both are same 
//that time we use this keyword to refer instance variable 
class Employee
{
	int id;
	String name;
	void get(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void show()
	{
		System.out.println("id: "+id+"\t"+"name: "+name);
	}
}
public class TestThis1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e= new Employee();
		e.get(101,"john");
		e.show();
	}

}
