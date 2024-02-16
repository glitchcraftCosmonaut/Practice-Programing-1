package WEEK_1;
//this is your main class where the program or file executed
public class Robot 
{
    //this is main program (same as public void start or awake in Unity)
    public static void main(String[] args)
    {
        //here you call the robot class as an object
        //the object basically class with variables that store values
        //notice that object containts variables data types contain values
        //here class is declared as new variable wich is r1
        //we can make many objects as many as we want as long as the variable names are different for each new object
        RobotClass r1 = new RobotClass("Alex","Blue",40);
        RobotClass r2 = new RobotClass("Rodric", "Red", 30);

        // r1.IntoduceRobot();
        // r2.IntoduceRobot();

        
        Person p1 = new Person("Alice", "Aggresive", true);
        Person p2 = new Person("Weynard", "calm", false);

        /*here we gonna add how class access each other
        * notice that in Person class we already make RobotClass variables called "robotOwned"
        * this allows Person class to have access to RobotClass
        * so we can modified the object as long as person class have robotclass
        */
        p1.robotOwned = r2;
        p2.robotOwned = r1;

        p1.IsSitting();
        p2.IsStandUp();

    }
}

/**
 * this is class that can be called on the object
 */
class RobotClass 
{
    String name;
    String color;
    int weight;
    
    //constructor is function that allows you to create an object from class (RobotClass)
    //used to set the attributes for example
    RobotClass(String name, String color, int weight)
    {
        //this mean object that access this constructor
        //for example this=r1 if r1 as an object from main class access this constructor
        //so the computer will write something like this "r1.name = name" and so on
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    void IntoduceRobot()
    {
        //this syntax will print the properties in terminal
        //notice the "this" argument is give for each variables, it's already explained above
        //so if object for example r1 use this function the computer will read as "r1.name" and so on
        System.out.println("\nHello My name is " + this.name + " My color is " + this.color + " My weight is " + this.weight);
    }
}

/*
 * this is part two of project
 * basically we want to make class interact each other
 */
/**
 * InnerRobot
 */
class Person 
{
    //the structures same with robot so it does't need explanations
    String name;
    String personality;
    Boolean isStandUp;
    //here we add robot class
    RobotClass robotOwned;

    Person(String name, String personality, Boolean isStandUp)
    {
        this.name = name;
        this.personality = personality;
        this.isStandUp = isStandUp;
    }
    //on these function I can call RobotClass function
    void IsSitting()
    {
        this.isStandUp = false;
        System.out.println("name: " + this.name + " \npersonality: " + this.personality + "\nStatus: " + this.isStandUp+ "\nrobot owned: " + this.robotOwned.name);
        this.robotOwned.IntoduceRobot();
    }

    void IsStandUp()
    {
        this.isStandUp = true;
        System.out.println("\nname: " + this.name + "\npersonality: " + this.personality + "\nStatus: " + this.isStandUp + "\nrobot owned: " + this.robotOwned.name);
        this.robotOwned.IntoduceRobot();
    }
    
}