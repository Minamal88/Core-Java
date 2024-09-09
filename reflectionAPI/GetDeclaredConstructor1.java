package reflectionAPI;
import java.lang.reflect.*;
class MyClass1
{
	private MyClass1()
	{
		
	}
	public MyClass1(int n)
	{
		
	}
}
public class GetDeclaredConstructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class c = MyClass1.class;
			Constructor con =c.getDeclaredConstructor();
			System.out.println("Constructor: "+con);
			Constructor con1 =c.getDeclaredConstructor(int.class);
			System.out.println("Constructor: "+con1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
