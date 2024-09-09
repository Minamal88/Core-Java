package methods;
//functions with no arguments but return type
public class Fun3 {

	int add()
	{
		int a=10,b=20,c;
		c=a+b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fun3 f=new Fun3();
		System.out.println("Add="+f.add());
	}

}
