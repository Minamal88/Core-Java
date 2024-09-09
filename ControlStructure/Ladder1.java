package controlStructure;
import java.util.*;
public class Ladder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1,m2,m3,total;
		double per;
		System.out.println("Enter three sub of marks: ");
		Scanner s = new Scanner(System.in);
		m1=s.nextInt();
		m2=s.nextInt();
		m3=s.nextInt();
		total=m1+m2+m3;
		per=total/3;
		System.out.println("Total: "+total);
		System.out.println("Percentage: "+per);
		if(per>=75 && per<=100)
		{
			System.out.println("Distinction");
		}
		else if(per>=60 && per<75)
		{
			System.out.println("First class");
		}
		else if(per>=45 && per<60)
		{
			System.out.println("Second class");
		}
		else if(per>=35 && per<45)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		s.close();
	}

}
