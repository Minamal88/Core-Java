package controlStructure;
import java.util.*;
public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch,a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("1.Addition \n2.Substraction");
		System.out.println("Enter your choice: ");
		ch=s.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter two values");
			a=s.nextInt();
			b=s.nextInt();
			c=a+b;
			System.out.println(a+" + "+b+" = "+c);
			break;
		
		case 2:
			System.out.println("Enter two values");
			a=s.nextInt();
			b=s.nextInt();
			c=a-b;
			System.out.println(a+" - "+b+" = "+c);
			break;
	
		/*case 3:
			System.out.println("Exit");
			exit(0);
			break;*/
		default:
			System.out.println("Invalid choice");
			break;
		}
	}
}
