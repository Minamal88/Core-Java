package Abstraction;

interface vehical
{
	String name="TVS";		//public+static+final
	int speed=100;			//public+static+final
	
	void start();			//public+abstract
	void stop();			//public+abstract
	
	default void color()
	{
		System.out.println("TVS color is red");
	}
	static void model()
	{
		System.out.println("Tvs model no. is 123");
	}
}

public class TestInterface1 implements vehical {

	public void start()
	{
		System.out.println("Start(): insert key  and press start button");
	}
	public void stop()
	{
		System.out.println("Stop(): Exit key");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface1 t = new TestInterface1();
		t.start();
		t.stop();
		t.color();
		
		System.out.println(name);
		System.out.println(speed);
		vehical.model();
	}

}
