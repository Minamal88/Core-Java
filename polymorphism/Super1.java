package polymorphism;

class Animal
{
	String color="Black";
}
class Dog extends Animal
{
	String color="Brown";
	void display()
	{
		System.out.println("Animal color is: "+super.color);
		System.out.println("Dog color is: "+color);
	}
}
public class Super1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.display();
	}

}
