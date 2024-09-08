package exceptionHandling;

public class TryCatchExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int arr[]= {1,3,4,5};
			System.out.println(arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}

}
