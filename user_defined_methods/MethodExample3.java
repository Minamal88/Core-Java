package user_defined_methods;

public class MethodExample3 {

	void add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Addition is: "+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample3 m = new MethodExample3();
		m.add(20,50);
	}

}
