package user_defined_methods;
//5! = 5*4*3*2*1
public class RecurssiveFunction {

	int fact(int n)	
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);	//recurssion
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecurssiveFunction r = new RecurssiveFunction();
		System.out.println("The factorial is: "+r.fact(5));
	}

}
