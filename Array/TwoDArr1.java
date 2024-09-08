package array;
import java.util.*;
public class TwoDArr1 {
	public static void main(String args[])
	{
		int a[][]=new int[2][3],i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array elements: ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Matrix of array elements: ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Transpose Matrix of array elements: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(a[j][i]+"\t");
			}
			System.out.println();
		}
	}

}
