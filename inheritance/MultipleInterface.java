package inheritance;
interface A1
{
	void msg();
}
interface B1
{
	void msg();
	
}
class C1 implements A1,B1
{
	public void msg()
	{
		System.out.println("Hello");
	}
}
public class MultipleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 r = new C1();
		r.msg();
	}

}
