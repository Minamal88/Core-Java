package ControlStructure;
import java.util.*;
public class Armstrong1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,temp,rem,c,sum=0;
		System.out.println("Enter the number: ");
		Scanner s = new Scanner(System.in);
		num=s.nextInt();	//num=153
		temp=num;
		while(num!=0)
		{
			rem=num%10;	//rem=1%10 =0.1 =1
			c=rem*rem*rem;	//c=1*1*1=1
			sum=sum+c;	//sum=152 + 1=153
			num=num/10; //num=1/10 =0.1 =0
		}
		System.out.println("The sum: "+sum);
		if(temp==sum)
		{
			System.out.println("Arsmtrong number");
		}
		else
		{
			System.out.println("Not Arsmtrong number");
		}
	}

}
