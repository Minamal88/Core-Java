package reflectionAPI;

class Simple1{}
public class ClassForNameExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class<?> c = Class.forName("polymorphism.Super1");
			System.out.println(c.getName());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
