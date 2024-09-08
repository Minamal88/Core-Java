package inheritance;
//Heirarchical Inheritance
class Animal
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog is barking...");
	}
}
class Cat extends Animal
{
	void meow()
	{
		System.out.println("Cat is meowing...");
	}
}
public class HeirarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		Cat c= new Cat();
		
		d.eat(); d.bark();
		c.eat(); c.meow();

	}

}
