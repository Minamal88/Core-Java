package ControlStructure;
import java.util.*;
public class For3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,n;
		System.out.println("Enter ending position=");
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Even numbers=");
		while(i<=n)
		{
			System.out.print(i+"\t");
			i+=2;	//i=i+2 =0+2 =2+2
		}
	}

}
