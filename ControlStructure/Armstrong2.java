package ControlStructure;
import java.util.*;
public class Armstrong2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int num,rem,sum,n,a,c;
				System.out.println("Armstrong number brtween 1 to 500 are as follows :");
				Scanner s=new Scanner(System.in);
				num=s.nextInt();
				for(n=1;n<=num;n++)
				{
					a=n;
					sum=0;
					
					while(n!=0)
					{
						rem=n%10;
						c=rem*rem*rem;
						sum=sum+c;
						n=n/10;
					}
					if(a==sum)
					{
						System.out.println(n);
					}
					
				}	 
	}		 
}
		 
