//13. Inheritance 
//Question: Create a base class Animal with a method makeSound(). Create a derived class Dog that overrides the makeSound() method. Demonstrate method overriding in the main method.

class Animal
{
	void makeSound()
	{
		System.out.println("All the animals make somekind of Sound");
	}
}  

class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("The animal Dog barks");
	}
	public static void main(String[] args) 
	{
		Animal aObj = new Dog();
		aObj.makeSound();
	}
}
