package ControlStructure;
import java.util.*;
public class Pallindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,temp,rem,rev=0;
		System.out.println("Enter the number=");
		Scanner s= new Scanner(System.in);
		num=s.nextInt();
		temp=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse number="+rev);
		if(rev==temp)
		{
			System.out.println("Pallindrome number");
		}
		else
		{
			System.out.println("Not Pallindrome number");
		}
	}

}
