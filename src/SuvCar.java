public class SuvCar extends Car
{
    double maxWeight = 200;
    SuvCar(String make, String model, int year, String color, double price, String carType)
    {
        super(make, model, year, color, price, carType);
        //TODO Auto-generated constructor stub
    }

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

    public String toString()
    {
        System.out.println("MaxWeight: "+this.maxWeight);
        return super.toString() + this.maxWeight;
    }

    
}
