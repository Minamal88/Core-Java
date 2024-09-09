package array;
import java.util.*;
public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int [5],i,j,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array elements: ");
		for(i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<5;i++)
		{
			for(j=i+1;j<5;j++)
			{
				if(a[i]>a[j])	//a[1]>a[2]  5>2
				{
					temp=a[i];	//temp=5
					a[i]=a[j];	//a[1]=2
					a[j]=temp;	//a[2]=5
				}
			}
		}
		System.out.println("Array elements in Ascending order: ");
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}

}
