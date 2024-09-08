package ControlStructure;
import java.util.*;
public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a=0,b=1,c,i;
		System.out.println("Enter the ending position: ");
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		System.out.println("The fibonaccie series is: ");
		for(i=1;i<=n;i++)
		{
			c=a+b;
			System.out.print(c+"\t");
			a=b;
			b=c;
		}
	}

}
