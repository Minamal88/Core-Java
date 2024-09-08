package Abstraction;

abstract class Animal
{
	void legs()
	{
		System.out.println("All animals have 4 legs");
	}
	abstract void sound();
	abstract void eat();
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Dog is barking");
	}
	void eat()
	{
		System.out.println("meat eating");
	}
}
class Cat extends Animal
{
	void sound()
	{
		System.out.println("Cat is meowing");
	}
	void eat()
	{
		System.out.println("Fish is eating");
	}
}
public class Abstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d= new Dog();
		Cat c= new Cat();
		d.legs(); d.sound();  d.eat();
		c.legs(); c.sound();  c.eat();
	}

}
