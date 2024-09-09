package controlStructure;
import java.util.*;
public class Nested1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("Enter the values of a,b and c: ");
		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>c)
		{
			if(a>b)
			{
				System.out.println("A is greater");
			}
			else
			{
				System.out.println("B is greater");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("B is greater");
			}
			else
			{
				System.out.println("C is greater");
			}
		}
		s.close();
	}

}
