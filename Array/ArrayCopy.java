package array;
import java.util.*;
public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5],b[]=new int[5],i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array elements: ");
		for(i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Array elements of A \t Array elements of B");
		for(i=0;i<5;i++)
		{
			b[i]=a[i];
			System.out.println(a[i]+"\t\t\t"+b[i]);
		}
		s.close();
	}

}
