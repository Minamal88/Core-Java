package exceptionHandling;

public class MultipleCatchBlock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception Ocuurs"+e);
		}
		System.out.println("Rest of the code");
	}

}
