package constructor;

class B
{
	int a;
	String b;
	B()		//default constructor
	{
		a=101;
		b="John";
		System.out.println(a+"\t"+b);
	}
}
public class Constructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
	}

}
