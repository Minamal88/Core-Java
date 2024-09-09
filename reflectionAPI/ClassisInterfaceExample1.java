package reflectionAPI;

class MySimple
{
	
}
interface MyInterface
{
	
}
public class ClassisInterfaceExample1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class c1 = Class.forName("reflectionAPI.MySimple");
		System.out.println(c1.isInterface());
		
		Class c2 = Class.forName("reflectionAPI.MyInterface");
		System.out.println(c2.isInterface());
	}

}
