//1. Class and Object
//Question: Create a Java class named Car with attributes brand, model, and year. Create an object of the Car class in the main method and display its details.


class Car
{
	String brand = "Chervolet";
	String model = "Malibu";
	int year = 2024;

	public static void main(String[] args) 
	{
		Car car1 = new Car();
		System.out.println("Details of the car are:");
		System.out.println("Brand: "+car1.brand);
		System.out.println("Model: "+car1.model);
		System.out.println("Year: "+car1.year);
	}
}
