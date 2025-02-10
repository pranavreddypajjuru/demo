//14. Polymorphism 
//Question: Create a class Animal with a method sound(). Create subclasses Dog and Cat that override the sound() method to print "Bark" and "Meow" respectively. Demonstrate method overriding in the main method.

class Animal1
{
	void sound()
	{
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal1
{
	void sound()
	{
		System.out.println("Dog barks");
	}
}

class Cat extends Animal1
{
	void sound()
	{
		System.out.println("Cat meows");
	}
}

class Test
{
	public static void main(String[] args) 
	{
		Animal1 a = new Dog();
		Animal1 b = new Cat();
		System.out.println("Calling Dog method");
		a.sound();
		System.out.println("Calling Cat method");
		b.sound();
	}
}
