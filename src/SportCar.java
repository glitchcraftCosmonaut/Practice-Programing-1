public class SportCar extends Car 
{
    //sports car is a sub class of car(Inheritance)
    double maxSpeed = 150;

    SportCar(String make, String model, int year, String color, double price, String carType)
    {
        super(make, model, year, color, price, carType);
        //TODO Auto-generated constructor stub
    }

    // method overriding = 	Declaring a method in sub class,
	//which is already present in parent class.
	//done so that a child class can give its own implementation

    // @Override 
    public String toString()
    {
        System.out.println("MaxSpeed: "+this.maxSpeed);
        return super.toString() + this.maxSpeed;
    }
        
}
