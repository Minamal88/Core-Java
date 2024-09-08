package exceptionHandling;

public class TestThrow1
{  
    				//defining a method  
    	public void checkNum(int num) throws ArithmeticException
    	{  
        		if (num < 1) 
        		{  
            			throw new ArithmeticException("Number is negative, cannot calculate square");  
        		}  
        		else 
        		{  
            			System.out.println("Square of " + num + " is " + (num*num));  
        		}  
    }  
    					//main method  
    public static void main(String[] args) 
   {  
            TestThrow1 obj = new TestThrow1();  
            try
            {
            	obj.checkNum(-3);
            }
            catch(Exception e)
            {
            	System.out.println(e);
            }
            System.out.println("Rest of the code..");  
    }  
} 
