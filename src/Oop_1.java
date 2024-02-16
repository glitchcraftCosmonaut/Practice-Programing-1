import java.io.IOException;
import java.util.Scanner;

public class Oop_1 
{

    public static void main(String[] args) throws IOException 
    {
        double discountedPrice;
        // ArrayList<Store> storeList = new ArrayList<Store>();
        Store store = new Store();
        String carType[] = {"SPORTCAR","SUVCAR"};
        // we no longer need to create a class and we can directly create an object
        // Car myCar1 = new Car();
        // Car myCar2 = new Car();
        System.out.println("Press enter to continue");
        Scanner scanner = new Scanner(System.in);
        
        System.in.read();
        scanner.nextLine();
        System.out.println("Enter Car QTY: ");
        int qty = scanner.nextInt();
        scanner.nextLine();
        int count = 0;

        while(count < qty)
        {
            System.out.println(carType[0] + " or " + carType[1]);
            System.out.println("Enter Car #" + count + " info: ");
            System.out.println("make: ");
            String make = scanner.nextLine();
            System.out.println("model: ");
            String model = scanner.nextLine();
            System.out.println("year: ");
            int year = scanner.nextInt();
            scanner.nextLine();
            System.out.println("color: ");
            String color = scanner.nextLine();
            System.out.println("price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            DiceRoller diceRoller = new DiceRoller(25);
            // System.out.println("Congratulations you've got discount: " + diceRoller.number + "%");
            discountedPrice = price - (price * diceRoller.number / 100);
            System.out.println("Enter car type: \n" + "[Y] Sport Car " + " [U] SUV Car\n");
            char carSelect = scanner.next().charAt(0);
            scanner.nextLine();
            switch (carSelect) {
                case 'y':
                    // carList.add(new SportCar(make, model, year, color, discountedPrice, carType[0]));
                    store.AddCar(make, model, year, color, discountedPrice, carType[0]);
                    break;
                case 'u':
                    store.AddCar(make, model, year, color, discountedPrice, carType[1]);
                    break;
            
                default:
                    break;
            }
            count++;
            // carList.add(new Car(make, model, year, color, price));
            // store.AddCar(make, model, year, color, discountedPrice);
            System.out.println("Car #" + count + " has been added to the store\n\n"+ "Discounted: "+diceRoller.number + "%\n" + "+============================================+\n");

        }

        // store.AddCar("ferrari", "fr26", 2001, "Blue", 100000.0);
        // store.AddCar("mercy", "fr26", 2001, "Blue", 100000.0);
        
        
        scanner.close();
        
        for(int i = 0; i < qty; i++)
        {
            // System.out.println(store.GetCar(i).CarInfo());
            store.GetCar(i).toString();
        }
        //example of using static keyword, you don't need to create an object to use it
        Car.CarCount();
        // store.GetAllCar();
        
        
        //we use toString() to print the object
        //this one is much simpler than using method aabove
        // Car myCar1 = new Car(make, model, year, color, discountedPrice);
        //implicit use:
        // System.out.println(myCar1);
        //explicit use:
        // System.out.println(myCar1.toString());
        //both use are same
    }
}

