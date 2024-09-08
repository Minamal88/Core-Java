package exceptionHandling;

public class NestedTryBlock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			try
			{
				System.out.println("Going to divide by zero");
				int b=20/0;
				System.out.println("Division is: "+b);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			try
			{
				int a[]=new int [5];
				a[5]=4;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Handled the exception by outer catch)");
		}
		System.out.println("Normal flow");
	}

}
