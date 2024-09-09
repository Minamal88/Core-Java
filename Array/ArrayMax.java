package array;
import java.util.*;
public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5],i,max=0,p=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array elements: ");
		for(i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<5;i++)	//i=4
		{
			if(max<a[i])	//max<a[3]   8<1
			{
				max=a[i];	//max=a[3]   max=8
				p=i;		//p=3;
			}
		}
		System.out.println("Maximum array element: "+max);
		System.out.println("Position of Maximum array element: "+p);
	}

}
