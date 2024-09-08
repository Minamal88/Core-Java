package constructor;

class A
{
	int a;
	String b;

	/*
	 * A() { a=0; b=null; }
	 */
	void show()
	{
		System.out.println(a+"\t"+b);
	}
	
}
public class Constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.show();
	}

}
