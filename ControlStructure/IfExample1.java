package controlStructure;
import java.util.*;
public class IfExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter the number: ");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		if(n>0)
		{
			System.out.println("Number is positive");
		}
		s.close();
	}

}
