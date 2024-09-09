package polymorphism;

class A
{
	void sum()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println("Addition is: "+c);
	}
	void sum(int a,int b)
	{
		System.out.println("Addition is: "+a+b);
	}
	void sum(int a,String b)
	{
		System.out.println(a+" "+b);
	}
}
public class FunctionOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj =new A();
		obj.sum();
		obj.sum(100, 200);
		obj.sum(11,"welcome");
	}

}
