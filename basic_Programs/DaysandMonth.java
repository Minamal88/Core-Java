package basic_Programs;
import java.util.*;
public class DaysandMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d,m,y;
		System.out.println("Enter days: ");
		Scanner s = new Scanner(System.in);
		d=s.nextInt();	//d=45
		y=d/365;
		m=d/30;		//m=45/30	m=1
		d=d%30;		//d=45%30=15
		System.out.println("Years: "+y+"\t Months: "+m+"\t Days: "+d);
		s.close();
	}

}
