package polymorphism;

class Animal1
{
	Animal1()
	{
		System.out.println("This Animal class");
	}
}
class Dog1 extends Animal1
{
	Dog1()
	{
		super();
		System.out.println("This is Dog class");
	}
}
public class Super2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d=new Dog1();
	}

}
