package basic_Programs;
import java.util.*;
public class Addition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value for a: ");
		a=s.nextInt();
		System.out.println("Enter the value for b: ");
		b=s.nextInt();
		c=a+b;
		System.out.println("Addition is: "+c);
		s.close();
	}

}
