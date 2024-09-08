package exceptionHandling;

public class TestThrows1
{  
   			 //defining a method  
    		public int divideNum(int m, int n) throws ArithmeticException
		 {  
        			int div = m / n;  
        			return div;  
    		}  
    				//main method  
  		 public static void main(String[] args) throws ArithmeticException
		 {  
        		TestThrows1 obj = new TestThrows1();  
        		obj.divideNum(45, 0);
  		     	/*try
  		     	{  
            		System.out.println();  
  		     	}  
        		catch (ArithmeticException e)
  		     	{  
        		 	System.out.println("Number cannot be divided by 0");  
  		     	}  */
  		     	System.out.println("Rest of the code..");  
		 }  
}  
