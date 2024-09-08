package inheritance;
//multilevel inheritance
import java.util.*;
class A
{
	protected int a,b;
	void input()
	{
		System.out.println("Enter two numbers: ");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
	}
}
class B extends A
{
	int c;
	void add()
	{
		c=a+b;
		System.out.println("Addition is: "+c);
	}
}
class C extends B
{
	int c;
	void sub()
	{
		c=a-b;
		System.out.println("Subtraction is: "+c);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj=new C();
		obj.input();
		obj.add();
		obj.sub();
	}

}
