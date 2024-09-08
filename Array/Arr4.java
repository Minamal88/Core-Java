package array;
import java.util.*;
public class Arr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[],b[],c[],i;
		a=new int[5];
		b=new int[5];
		c=new int[5];
		System.out.println("Enter the array elements of a: ");
		Scanner s=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the array elements of b: ");
		for(i=0;i<5;i++)
		{
			b[i]=s.nextInt();
		}
		System.out.println("Addition of array elements: ");
		for(i=0;i<5;i++)
		{
			c[i]=a[i]+b[i];
			System.out.println(a[i]+"+"+b[i]+"="+c[i]);
		}
	}

}
