package controlStructure;
import java.util.*;
public class Armstrong1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n,temp,rem,c,sum=0;
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the number: ");
       n=s.nextInt();
       temp=n;	//temp=153
       while(n!=0)
       {
    	   rem=n%10;	//rem=153%10 =15.3 =3
    	   				//rem=15%10 =1.5 =5
    	   				//rem=1%10 =0.1 =1
    	   c=rem*rem*rem;	//c=3*3*3 =27
    	   					//c=5*5*5 =125
    	   					//c=1*1*1 =1
    	   sum=sum+c;	//sum=0+27 =27
    	   				//sum=27+125 =152
    	   				//sum=152+1 =153
    	   n=n/10;	//n=153/10 =15.3 =15
    	   			//n=15/10 =1.5 =1
    	   			//n=1/10 =0.1 =0
       }
       System.out.println("The sum is: "+sum);
       if(sum==temp)
       {
    	   System.out.println("It is Armstrong number");
       }
       else
       {
    	   System.out.println("It is not an Armstrong number");
       }
       s.close();
	}

}
