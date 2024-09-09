package reflectionAPI;

class ExampleClass
{
	public ExampleClass()
	{
		System.out.println("This is display method");
	}
}
public class NewInstanceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			Class<?> c = Class.forName("reflectionAPI.ExampleClass");
			ExampleClass e = (ExampleClass)c.newInstance();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
