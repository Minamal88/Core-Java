package array;

import java.util.Scanner;

public class Arr6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5],i,max=0,l=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array elements: ");
		for(i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<5;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				l=i;
			}
		}
		System.out.println("The maximum array element is "+max);
		System.out.println("The position of max array element: "+l);
	}

}
