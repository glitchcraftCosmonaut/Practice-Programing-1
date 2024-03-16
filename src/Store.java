// import java.lang.reflect.Array;
import java.util.ArrayList;

public class Store 
{
    private ArrayList<Car> carList;
    
    public Store()
    {
        carList = new ArrayList<Car>();
    }

    public void AddCar(String make, String model, int year, String color, double price, String carType)
    {
        if(carType == "SPORTCAR")
        {
            carList.add(new SportCar(make, model, year, color, price, carType));
        }
        else if(carType == "SUVCAR")
        {
            carList.add(new SuvCar(make, model, year, color, price, carType));
        }
        // carList.add(new Car(make, model, year, color, price, carType));
    }

    public Car GetCar(int index)
    {
        // Car car = carList.get(index);
        // return car;
        return carList.get(index);
    }

    //show all car
    public ArrayList<Car> GetAllCar()
    {
        // System.out.println(carList.toString());
        return carList;
    }
    // public void copy(Car x)
    // {
    //     carList.add(x);
    // }

    
}
