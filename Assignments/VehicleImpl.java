//Abstraction 
//Question: Create an abstract class Vehicle with an abstract method start(). Create subclasses Car and Bike that implement the start() method.

abstract class Vehicle
{
	abstract void start();
}

class Car extends Vehicle
{
	void start()
	{
		System.out.println("You can self start your car using your key:");
	}
}

class Bike extends Vehicle
{
	void start()
	{
		System.out.println("You can use the kick rod to start your bike:");
	}
}

class VehicleImpl
{
	public static void main(String[] args) 
	{
		Vehicle a = new Car();
		System.out.println("For Car:");
		a.start();
		Vehicle b = new Bike();
		System.out.println("For Bike:");
		b.start();
	}
}
