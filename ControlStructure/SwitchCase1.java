package controlStructure;
import java.util.*;
public class SwitchCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		System.out.println("Enter your choice: ");
		Scanner s = new Scanner(System.in);
		ch=s.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		s.close();
	}

}
