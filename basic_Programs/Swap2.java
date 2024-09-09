package basic_Programs;
import java.util.*;
public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("Enter the values of a & b: ");
		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Before Swapping: a: "+a+"\t b:"+b);
		a=a+b;		//a=10+20=30
		b=a-b;		//b=30-20=10
		a=a-b;		//a=30-10=20
		System.out.println("After Swapping: a: "+a+"\t b:"+b);
		s.close();
	}

}
