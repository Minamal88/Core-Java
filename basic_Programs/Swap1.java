package basic_Programs;
import java.util.*;
public class Swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,temp;
		System.out.println("Enter the values of a & b: ");
		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Before Swapping: ");
		System.out.println("a: "+a+"\t b: "+b);		//a=10  b=20
		temp=a;		//temp=10
		a=b;		//a=20
		b=temp;		//b=10
		System.out.println("After Swapping: ");
		System.out.println("a: "+a+"\t b: "+b);
		s.close();
	}

}
