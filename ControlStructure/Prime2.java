package ControlStructure;
import java.util.*;
public class Prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,c;
		System.out.println("Enter ending position: ");
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Prime is: ");
		for(i=1;i<=n;i++)
		{
			c=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0) //2%2==0
				{
					c++;	//c=2
				}
			}
			if(c==2)
			{
				System.out.print(i+"\t");
			}
		}
	}

}
