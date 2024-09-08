package classesAndObjects;
//Anonymous object creation : nameless object creation
class Calculation
{
	void fact(int n)
	{
		int fact=1,i;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is:"+fact);
	}
}
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculation().fact(5);
	}

}
