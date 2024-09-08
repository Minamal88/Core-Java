package encapsulation;
import java.util.*;
class Bank
{
	private double bal=2000;
	private int pwd;
	public void deposite(double money)
	{
		System.out.println("Enter password: ");
		Scanner s= new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			bal=bal+money;
			System.out.println("Deposited money: "+money);
			System.out.println("Total balance: "+bal);
			
		}
		else
		{
			System.out.println("Incorrect password");
		}
	}
	public void withdraw(double money)
	{
		System.out.println("Enter password: ");
		Scanner s= new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			bal=bal-money;
			System.out.println("Withdrawn money: "+money);
			System.out.println("Total balance: "+bal);
			
		}
		else
		{
			System.out.println("Incorrect password");
		}
	}
	public void checkBal()
	{
		System.out.println("Enter password: ");
		Scanner s= new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			System.out.println("Total balance: "+bal);
			
		}
		else
		{
			System.out.println("Incorrect password");
		}
	}
}
public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		int ch;
		System.out.println("1.Deposite");
		System.out.println("2.Withdraw");
		System.out.println("3.Check Balance");
		
		System.out.println("Enter your choice: ");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			b.deposite(5000);
			break;
		case 2:
			b.withdraw(1000);
			break;
		case 3:
			b.checkBal();
			break;
		default:
			System.out.println("Invalid choice");
		}
	}

}
