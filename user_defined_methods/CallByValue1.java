package user_defined_methods;

public class CallByValue1 {

	void change(int n)
	{
		System.out.println("Before Addition, value is: "+n);
		n=n+100;
		System.out.println("After addition, value is: "+n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4;
		CallByValue1 c = new CallByValue1();
		System.out.println("Before function call, value is: "+num);
		c.change(num);	//copy
		System.out.println("After function call, value is: "+num);
	}

}
