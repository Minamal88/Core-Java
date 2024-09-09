package user_defined_methods;

public class MethodExample2 {

	int add()
	{
		int a=10,b=20,c;
		c=a+b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample2 m = new MethodExample2();
		System.out.println("Addition is: "+m.add());
	}

}
