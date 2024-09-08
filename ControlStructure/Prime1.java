package ControlStructure;
import java.util.*;
public class Prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,c=0;
		System.out.println("Enter the number=");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)	//5%5==0
			{
				c++;	//c=2
			}
		}
		if(c==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime Number");
		}
	}

}

//WAP, to find prime numbers between 1 to n.

