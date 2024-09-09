package array;
import java.util.*;
public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[5];
		int i; //a[0]=1,a[1]=3,a[2]
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array elements of A and b: ");
		for(i=0;i<5;i++)
		{
			a[i]=s.nextInt();
			b[i]=s.nextInt();
		}
		System.out.println("Addition of array elements: ");
		for(i=0;i<5;i++)
		{
			c[i]=a[i]+b[i];
			System.out.println(a[i]+" + "+b[i]+" = "+c[i]);
		}
	}

}
