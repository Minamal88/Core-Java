package exceptionHandling;

class A
{
	void show() throws ClassNotFoundException
	{
		Class.forName("demo");
	}
}
public class ThrowsExample1 {

	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		A obj= new A();
		obj.show();
	}

}
