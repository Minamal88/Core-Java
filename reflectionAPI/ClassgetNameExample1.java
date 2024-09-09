package reflectionAPI;
import classesAndObjects.Factorial;
class Simple{}
public class ClassgetNameExample1 {
	public static void main(String args[])
	{
		Factorial s = new Factorial();
		Class c = s.getClass();
		String name = c.getName();
		System.out.println("The class name: "+name);
	}
}
