package controlStructure;
import java.util.*;
public class Fibo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,a=0,b=1,c;
		System.out.println("Enter ending position: ");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Fibonaccie Series is : \n");
		for(i=1;i<=n;i++)
		{
			c=a+b;
			System.out.print(c+"\t");
			a=b;
			b=c;
		}
		s.close();
	}

}
