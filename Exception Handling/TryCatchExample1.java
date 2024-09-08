package exceptionHandling;

public class TryCatchExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			System.out.println("Rest of the code");
			int data1=50/0;
			System.out.println(data1);
			
		}
		catch(ArithmeticException e)
		{
			//System.out.println(e);
			//System.out.println("Can't divided by zero");
			int data2=20/0;
			System.out.println(data2);
			
		}
		
	}

}
