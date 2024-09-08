package array;
import java.util.*;
public class Arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5],i;
		for(i=0;i<5;i++)
		{
			System.out.println("Enter array elements: ");
			Scanner s= new Scanner(System.in);
			a[i]=s.nextInt();
		}
		for(i=0;i<5;i++)
		{
			System.out.println("Array elements of "+i+"th positon: "+a[i]);
		}
	}

}
