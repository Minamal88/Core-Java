package user_defined_methods;

public class CallByReference1 {

	int n=10;
	void change(CallByReference1 c)
	{
		c.n=c.n+100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByReference1 c = new CallByReference1();
		System.out.println("Before change: "+c.n);
		c.change(c);
		System.out.println("After change: "+c.n);
	}

}
