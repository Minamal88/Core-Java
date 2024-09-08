package exceptionHandling;

class AgeException extends Exception
{
	public AgeException() 
	{
		System.out.println("Age not valid");
	}
}
class Testing
{ 
	int age;
	void check(int age) throws AgeException
	{
		this.age=age;
		if(age<18)
			throw new AgeException();
		else
			System.out.println("age is vaid.............");
	}
}

public class CustomException 
{
	public static void main(String[] args)
	 {
	Testing t=new Testing();             
	try 
	{
		t.check(9);
	} 
	catch (AgeException e) 
	{
		e.printStackTrace();
	}
	System.out.println("Rest of the code");
	}

}
