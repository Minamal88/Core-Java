package basic_Programs;
import java.util.*;
public class StudentRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int roll,m1,m2,m3,total;
		String name;
		double per;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the name: ");
		name=s.nextLine();
		System.out.println("Enter the roll no: ");
		roll=s.nextInt();
		System.out.println("Enter three sub of marks: ");
		m1=s.nextInt();
		m2=s.nextInt();
		m3=s.nextInt();
		total=m1+m2+m3;
		per=total/3;
		System.out.println("Student Record");
		System.out.println("Roll no: "+roll);
		System.out.println("Name: "+name);
		System.out.println("Three sub of marks: m1: "+m1+"\t m2: "+m2+"\t m3: "+m3);
		System.out.println("Total: "+total);
		System.out.println("Percentage: "+per);
		s.close();
	}

}
