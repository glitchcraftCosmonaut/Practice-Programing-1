// import java.lang.reflect.Array;
import java.util.ArrayList;

public class Store 
{
    private ArrayList<Car> carList;
    
    public Store()
    {
        carList = new ArrayList<Car>();
    }

    public void AddCar(String make, String model, int year, String color, double price)
    {
        carList.add(new Car(make, model, year, color, price));
    }

    public Car GetCar(int index)
    {
        // System.out.println(carList);
        return carList.get(index);
    }

    //show all car
    public ArrayList<Car> GetAllCar()
    {
        // System.out.println(carList.toString());
        return carList;
    }
}
