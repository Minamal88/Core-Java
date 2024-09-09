package array;
import java.util.*;
public class TwoDArrayAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][3],b[][]=new int[2][3],c[][]=new int[2][3],i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array elements for A: ");
		for(i=0;i<2;i++)	//no of rows
		{
			for(j=0;j<3;j++)	//no of columns
			{
				a[i][j]=s.nextInt();
			}
		}
		
		System.out.println("Enter array elements for B: ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		
		System.out.println("Matrix for A: \n");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Matrix for B: \n");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Addition of matrix elements: ");
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
