package controlStructure;
import java.util.*;
public class TernaryExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,r;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values of a,b,c: ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		r=(a>c)?(a>b?a:b):(b>c?b:c); 
		System.out.println("Greater value is: "+r);
		s.close();
	}

}
