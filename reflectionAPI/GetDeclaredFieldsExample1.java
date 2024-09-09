package reflectionAPI;
import java.lang.reflect.*;
class MyClass
{
	private int myfield;
}
public class GetDeclaredFieldsExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class<?> c = MyClass.class;
			Field f = c.getDeclaredField("myfield");
			System.out.println("Field name: "+f.getName());
			System.out.println("Field type: "+f.getType());
			System.out.println("Field modifiers: "+Modifier.toString(f.getModifiers()));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
