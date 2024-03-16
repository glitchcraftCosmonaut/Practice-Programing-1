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
    void CarInfo()
    {
        System.out.println("Car Make is "+this.getMake());
        System.out.println("Car model is "+this.getModel());
        System.out.println("Car year is "+this.getYear());
        System.out.println("Car color is "+this.color);
        System.out.println("Car price is "+this.price);
        System.out.println("Car Type is "+this.carType);
        System.out.println("<===============================>\n\n");
    }

    // @Override 
    public String toString()
    {
        System.out.println("MaxSpeed: "+this.maxSpeed);
        return super.toString() + this.maxSpeed;
    }
        
}
