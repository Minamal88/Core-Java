package thisKeyword;
//If we want to call constructor by this keyword it is possible.
class Temp
{
	Temp()
	{
		this(10);
		//System.out.println("Welcome to 3RI");
	}
	Temp(int a)
	{
		//this();
		System.out.println(a);
	}
}
public class TestThis3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp t=new Temp();
	}

}
