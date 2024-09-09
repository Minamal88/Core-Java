package methods;
//functions with  arguments and return type
public class Fun5 {
	
	int add(int a,int b)	////formal parameters
	{
		int c;
		c=a+b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fun5 f=new Fun5();
		System.out.println("add="+f.add(20, 30));
	}

}
