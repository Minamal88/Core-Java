package exceptionHandling;

public class MultipleCatchBlock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[]=new int[5];
			a[5]=30/2;
			System.out.println(a[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array out of bounds Exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception Ocuurs");
		}
		System.out.println("Rest of the code");
	}

}
