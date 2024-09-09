package polymorphism;
//super keyword
class Vehical
{
	void run()
	{
		System.out.println("vehical is running");
	}
}
class Bike extends Vehical
{
	void run()
	{
		System.out.println("Bike is running");
	}
	void show()
	{
		super.run();
		run();
	}
}
public class FunctionOverriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike();
		b.show();
	}

}
