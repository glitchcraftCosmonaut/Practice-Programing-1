public class SportCar extends Car 
{
    final String carType = "SPORTCAR";

    SportCar(String make, String model, int year, String color, double price)
    {
        super(make, model, year, color, price);
        //TODO Auto-generated constructor stub
    }

    @Override 
    void CarInfo()
    {
        System.out.println("CAR TYPE = " + carType);
        System.out.println("Car model is "+this.make);
        System.out.println("Car model is "+this.model);
        System.out.println("Car year is "+this.year);
        System.out.println("Car color is "+this.color);
        System.out.println("Car price is "+this.price);
        System.out.println("<===============================>\n\n");
    }
        
}
