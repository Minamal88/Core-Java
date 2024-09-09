package reflectionAPI;

import java.lang.reflect.*;
class Example1
{
	public void myMethod(int n,String msg)
	{
		System.out.println("Number: "+n+" "+"Message: "+msg);
	}
}
public class GetDeclaredMethodExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class c = Example1.class;
			Method m = c.getDeclaredMethod("myMethod", int.class,String.class);
			m.invoke(new Example1(), 10,"Hello");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
