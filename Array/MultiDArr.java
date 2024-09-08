package array;
//Multi D Array
import java.util.*;
public class MultiDArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][][],i,j,k;
		a=new int[2][2][3];
		Scanner s= new Scanner(System.in);
		System.out.println("Enter array elements: ");
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
		System.out.println("Matrix of array elements: ");
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
	}

}
