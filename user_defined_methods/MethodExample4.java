package user_defined_methods;

public class MethodExample4 {

	int add(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample4 m = new MethodExample4();
		System.out.println("Addition is: "+m.add(20, 60));
	}

}
