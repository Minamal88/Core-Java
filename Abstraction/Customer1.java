package Abstraction;
import java.util.Scanner;
abstract class Bank
{
	public String name="myBank";
	public String IFSC="myBank123";
	
	public void bankDetails()
	{
		System.out.println("Bank Name: "+name);
		System.out.println("Bank_IFSC code: "+IFSC);
	}
	//password = 123
	abstract void deposite();
	abstract void withdraw();
	abstract void checkBal();
}
class BankServices extends Bank
{
	private double bal=5000;
	private int pwd;
	public double money;
	public void deposite()
	{
		System.out.println("Enter password: ");
		Scanner s= new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			System.out.println("Enter deposited amount: ");
			money=s.nextDouble();
			bal=bal+money;
			System.out.println("Deposited money: "+money);
			System.out.println("Total balance: "+bal);
			
		}
		else
		{
			System.out.println("Incorrect password");
		}
		s.close();
	}
	public void withdraw()
	{
		System.out.println("Enter password: ");
		Scanner s= new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			System.out.println("Enter deposited amount: ");
			money=s.nextDouble();
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
public class Customer1 {
	public static void main(String args[])
	{
		BankServices b= new BankServices();
		b.bankDetails();
		
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
			b.deposite();
			break;
		case 2:
			b.withdraw();
			break;
		case 3:
			b.checkBal();
			break;
		default:
			System.out.println("Invalid choice");
		}
	}

}
