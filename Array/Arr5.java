package array;
import java.util.*;
public class Arr5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5],i,j,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array elements: ");
		for(i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<5;i++)
		{
			for(j=i+1;j<5;j++) //5 3 8 7 5
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Ascending order array elements: ");
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}

}
