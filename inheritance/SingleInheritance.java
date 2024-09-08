package inheritance;

class Father
{
	protected int amount=5000;
	void input()
	{
		System.out.println("Father's amount: "+amount);
	}
}
class Son extends Father
{
	int money=2000;
	void show()
	{
		System.out.println("Son's money: "+money);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s= new Son();
		s.input();
		s.show();
	}

}
