package multithreading;

class Demo1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("Hello");
		}
	}
}

class Demo2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println("Hii");
		}
	}
}
public class MultithreadingExample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Demo1 d1 = new Demo1();
		Demo2 d2 =new Demo2();
		d1.start();
		System.out.println("Threas isalive: "+d1.isAlive());
		//d1.setPriority(2);
		d2.start();
		d2.join();
		System.out.println("Thread is running: "+d1.getName());
		d1.setName("Demo1 Thread");
		System.out.println("Thread is running: "+d1.getName());
		//System.out.println("Thread priority: "+d1.getPriority());
		System.out.println("Thread priority: "+d1.getPriority());
		System.out.println("Welcome...");
	}

}
