package array;

import java.util.Scanner;

public class Arr7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5],i,min,l;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array elements: ");
		for(i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		min=a[0];
		l=0;
		for(i=0;i<5;i++)
		{
			if(min>a[i])
			{
				min=a[i];
				l=i;
			}
		}
		System.out.println("The maximum array element is "+min);
		System.out.println("The position of max array element: "+l);
	}

}
