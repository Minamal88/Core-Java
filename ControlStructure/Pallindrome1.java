package controlStructure;
import java.util.*;
public class Pallindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rem,rev=0,temp;
		System.out.println("Enter the number: ");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		temp=n;		//temp=121
		while(n!=0)
		{
			rem=n%10;	//rem=121%10 =12.1 =1
						//rem=12%10 =1.2 =2
						//rem=1%10 =0.1 =1
			rev=rev*10+rem;		//rev=0*10+1 =1
								//rev=1*10+2 =12
								//rev=12*10+1 =121
			n=n/10;		//n=121/10 =12.1 =12
						//n=12/10 =1.2 =1
						//n=1/10 =0.1 =0
		}
		System.out.println("The reverse number: "+rev);
		if(rev==temp)
		{
			System.out.println("Pallindrome number");
		}
		else
		{
			System.out.println("Not Pallindrome number");
		}
		s.close();
	}

}
