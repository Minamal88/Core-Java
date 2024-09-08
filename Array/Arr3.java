package array;
//copy array
import java.util.*;
public class Arr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[],b[],i;
		a= new int[5];
		b= new int[5];
		System.out.println("Enter the array elements: ");
		Scanner s= new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Elements of a \t Elements of b ");
		for(i=0;i<5;i++)
		{
			b[i]=a[i];
			System.out.println(a[i]+"\t\t"+b[i]);
		}
	}

}
