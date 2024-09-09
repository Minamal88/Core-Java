package array;
import java.util.*;
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5],i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array elements");
		for(i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Array elements are: ");
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		s.close();
	}

}
