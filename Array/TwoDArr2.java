package array;

import java.util.Scanner;

public class TwoDArr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][],b[][],c[][],i,j;
		a=new int[2][3];
		b=new int[2][3];
		c=new int[2][3];
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array elements of a: ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter array elements of b: ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		
		System.out.println("Matrix of array elements of a: ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("Matrix of array elements of b: ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("Addition of maxtrix array elements: ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
