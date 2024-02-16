public class SuvCar extends Car
{
    double maxWeight = 200;
    SuvCar(String make, String model, int year, String color, double price, String carType)
    {
        super(make, model, year, color, price, carType);
        //TODO Auto-generated constructor stub
    }

    public String toString()
    {
        System.out.println("MaxWeight: "+this.maxWeight);
        return super.toString() + this.maxWeight;
    }

    
}
