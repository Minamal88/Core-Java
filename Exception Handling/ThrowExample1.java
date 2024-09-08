package exceptionHandling;

public class ThrowExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=20,j=0;
		try
		{
			j=18/i;
			if(j==0) 
			{
				throw new ArithmeticException("can't divided by zero");
			}
			System.out.println(j);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}

}
