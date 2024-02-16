import java.util.Random;

public class DiceRoller 
{
    //local =  declared inside a method
    //visible only to that method

    //global= declared outside a method, but within a class
    //visible to all parts of a class

    
    //#region local variable example
    // DiceRoller()
    // {
    //     //local example
    //     //this is a constructor without parameter
    //     Random random = new Random();
    //     int number = 0;
    //     //notice that if we use local wea can't pass out variables to roll method
    //     // roll();
    //     //we need to make argument from variables
    //     roll(random, number);
    
    // }
    // //this should work for local variable
    // void roll(Random random, int number)
    // {
        //     number = random.nextInt(6) + 1;
        //     System.out.println(number);
        // }
        
        //#endregion

    //this is global variable
    Random random;
    int number;
    int bound;
        
    //#region global variable example
    DiceRoller()
    {
        random = new Random();
        roll();
    }
    //overloading constructor
    DiceRoller(int bound)
    {
        this.bound = bound;
        random = new Random();
        roll();
    }
    
    //if using local we can't pass out variables to roll method
    //but if we use global we can
    void roll()
    {
        number = random.nextInt(bound,100) + 1;
        // System.out.println(number);
    }
    //#endregion
}
