package array;

import java.util.Scanner;

public class MultiDArrAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][][],b[][][],c[][][],i,j,k;
		a=new int[2][2][3];
		b=new int[2][2][3];
		c=new int[2][2][3];
		Scanner s= new Scanner(System.in);
		System.out.println("Enter array elements for A: ");
		for(i=0;i<2;i++)		//no. of matrix
		{
			for(j=0;j<2;j++)	//no. of rows
			{
				for(k=0;k<3;k++)	//no. of column
				{
					a[i][j][k]=s.nextInt();
				}
			}
		}
		System.out.println("Enter array elements for B: ");
		for(i=0;i<2;i++)		//no. of matrix
		{
			for(j=0;j<2;j++)	//no. of rows
			{
				for(k=0;k<3;k++)	//no. of column
				{
					b[i][j][k]=s.nextInt();
				}
			}
		}
		System.out.println("Matrix of array elements for A: ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				for(k=0;k<3;k++)
				{
					System.out.print(a[i][j][k]+"\t");
				}
				System.out.println();
			}
			System.out.println("-----------------------------");
		}
		System.out.println("Matrix of array elements for B: ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				for(k=0;k<3;k++)
				{
					System.out.print(b[i][j][k]+"\t");
				}
				System.out.println();
			}
			System.out.println("-----------------------------");
		}
		System.out.println("Addition of matrix array elements: ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				for(k=0;k<3;k++)
				{
					c[i][j][k]=a[i][j][k]+b[i][j][k];
					System.out.print(c[i][j][k]+"\t");
				}
				System.out.println();
			}
			System.out.println("-----------------------------");
		}
	}

}
