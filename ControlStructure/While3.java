package controlStructure;
import java.util.*;
public class While3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,n;
		System.out.println("Enter ending position: ");
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		while(i<=n)
		{
			System.out.print(i+"\t");
			i+=2;	//i=i+2=0+2=2+2=4
		}
	}

}
