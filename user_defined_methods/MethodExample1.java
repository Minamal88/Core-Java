package user_defined_methods;
import java.util.*;
public class MethodExample1 {
	void fun()
	{
		System.out.println("hello");
	}
	void add()
	{
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two values: ");
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		System.out.println("Addition is: "+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample1 m = new MethodExample1();
		m.fun();
		m.fun();
		m.add();
		m.add();
	}

}
