

public class Car 
{
    String make;
    String model;
    int year;
    String color;
    double price;
    String carType;
    /**
     * Static = modifier, a single copy of a variable/method is created and shared
     *          the class "owns" the static member
     */
    static int carCount = 0;

    // constructor have same bname as class
    //this is contructor with parameter

    Car (String make, String model, int year, String color, double price, String carType)
    {
        // "this" is a keyword which is used to access the variable inside the class
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.carType = carType;
        carCount++;
    }

    //we can pass this method
    public void CarInfo()
    {
        System.out.println("Car Make is "+this.make);
        System.out.println("Car model is "+this.model);
        System.out.println("Car year is "+this.year);
        System.out.println("Car color is "+this.color);
        System.out.println("Car price is "+this.price);
        System.out.println("Car Type is "+this.carType);
        System.out.println("<===============================>\n\n");
        // return this.make + "\n" + this.model + "\n" + this.year + "\n" + this.color + "\n" + this.price;

    }

    //let's use toString()
    //basically we can make the output same as the above method

    //toString() = special method that all objects inherit, 
    // that returns a string that "textually represents" an object.
    //can be used both implicitly and explicitly
    public String toString()
    {
        // String myString = this.make + "\n" + this.model + "\n" + this.year + "\n" + this.color + "\n" + this.price;
        // return myString;
        System.out.println("Car model is "+this.make);
        System.out.println("Car model is "+this.model);
        System.out.println("Car year is "+this.year);
        System.out.println("Car color is "+this.color);
        System.out.println("Car price is "+this.price);
        System.out.println("Car Type is "+this.carType);
        System.out.println("<===============================>\n\n");
        return this.make + "\n" + this.model + "\n" + this.year + "\n" + this.color + "\n" + this.price + "\n" + this.carType;
    }

    static void CarCount()
    {
        System.out.println("Total car in the store is " + carCount);
    }

    // void Drive()
    // {
    //     System.out.println("Driving");
    // }
    // void Brake()
    // {
    //     System.out.println("Braking");
    // }
}
