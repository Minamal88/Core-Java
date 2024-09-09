package methods;
//functions with  arguments but no return type
public class Fun4 {
	void add(int a,int b)	////formal parameters
	{
		int c;
		c=a+b;
		System.out.println("Add="+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fun4 f=new Fun4();
		f.add(10,20);	//actual parameters
	}

}
