package WEEK_1;
import java.util.ArrayList;
import java.util.Collections;

public class SecondStage 
{
    public static void main(String[] args) 
    {
        //here we gonna use advanced concepts of java, we alraedy learn basic concept
        //In APP, ForExe,GUIExample,GridLayout, we have used basic concepts of java
        //we gonna use advanced concepts of java in this project
        /**wrapper classes              primitive data types
         *  Example:            
         * 1. String                   
         * 2. Integer                   int
         * 3. Double                    double
         * 4. Boolean                   boolean
         * 5. Character                 char
         * 
         * pay attention above, we already learn that String is reference data type
         * so basically wrapper classes is a reference data type
         * primitive data types can act as reference data type using wrapper class
         * notice that wrapper class start with capital letter
         * wrapper class can act like primitive data types
         * for example code still can work if we type Integer tes = 1; Boolean tes = true;
         * in java its called autoboxing
         * autoboxing is the process of converting primitive data type to wrapper class
         * unboxing is the process of converting wrapper class to primitive data type
         * Wrapper class is slower than primitive data types in terms of memory usage
         */

         Boolean a = true;
         Boolean b = true;

         if(a == true)
         {
            //a will act like primitive data type
            //this is unboxing
            System.out.println("a is true");
            System.out.println();
        }
        //this is autoboxing
        //here what the wrapper class used for, it has ability to access the
    
        System.out.println(Boolean.compare(a, b));

        //Arraylist is resizeable array
        /**element can be added or removed after compilation phase
         * store references data types
         */

        ArrayList<String> food = new ArrayList<String>();

        //useful method of arraylist
        //add element to array
        food.add("Bread");
        food.add("Butter");
        food.add("Cheese");

        //change element in array
        food.set(0, "Milk");
        //clear element in arraylist
        //food.clear();

        //display element in arraylist
        for(int i = 0; i < food.size(); i++)
        {
            //print arraylist element
            System.out.println(food.get(i));
        }

        //2D array list
        //basically same with standard array, but this is more dynamic
        ArrayList<ArrayList<String>> elements = new ArrayList<ArrayList<String>>();
        

        ArrayList<String> liquid = new ArrayList<String>();

        liquid.add("Water");
        liquid.add("Juice");
        liquid.add("Soda");

        ArrayList<String> gas = new ArrayList<String>();

        gas.add("oxygen");
        gas.add("Carbon dioxide");
        gas.add("Hydrogen");

        ArrayList<String> Solid = new ArrayList<String>();

        Solid.add("Metal");
        Solid.add("Iron");
        Solid.add("Obsidian");

        elements.add(liquid);
        elements.add(gas);
        elements.add(Solid);

        //print all elements
        System.out.println(elements);
        //print certain elemen
        System.out.println(elements.get(0).get(2));

        // for-each =traversing technique to iterate through the elements in an array/collection
		//	        less steps, more readable
		//	        less flexible
        ArrayList<String> animals = new ArrayList<String>();
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");

        //for every string index in animals, print the string
		for(String i : animals) 
        {
			System.out.println(i);
		}
        //same like this
        for(int i = 0; i < animals.size(); i++)
        {
            System.out.println(animals.get(i));
        }
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i = 1; i <= 10; i++)
        {
            //continue running the loop but stop processing the remainder of the code in its body for this particular iteration
            
            //example
            if(i%2 == 0)
            //if number is even skip and continue
                continue;
            //if number is odd add to array
            numbers.add(i);
            // System.out.println();
        }
        System.out.print(numbers);
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println(max);
        System.out.println(min);
        
        //first method
        System.out.println(add(max, min));
        //second method
        System.out.println(add(max, min, max));
        //third method
        System.err.println(add(max, min, max, min));
        //fourth method
        System.err.println(add(2.0, 2.6, 2.6, 4.5));

        format();

        // max(ArrayList<Integer> list) list;
        // int max = elements.get(0);
        
        // System.out.println(Math.min(max, numbers.size()));
    }

    //method
    static int add(int a, int b)
    {
        return a + b;
    }
    //overload method = method with same name but different parameters
    //                  method name + parameter = method signature
    
    static int add(int a, int b, int c)
    {
        return a + b + c;
    }

    static int add(int a, int b, int c, int d)
    {
        return a + b + c + d;
    }
    //can use different data type in method
    static double add(double a, double b, double c, double d)
    {
        return a + b + c + d;
    }

    static void format()
    {
        //final keyword = variable that cannot be changed
        //it's common practice using uppercase letter for final variable
        final double PI = 3.14159;
        //PI = 3.14; you can't update your value

        System.out.println(PI);

        // printf() = 	an optional method to control, format, and display text to the console window
		//				two arguments = format string + (object/variable/value)
		//				% [flags] [precision] [width] [conversion-character]

				

		boolean myBoolean = true;

		char myChar = '@';

		String myString = "Bro";

		int myInt = 50;

		double myDouble = 1000;

			

		// [conversion-character]
		System.out.printf("%b",myBoolean);
		System.out.printf("%c",myChar);
		System.out.printf("%s",myString);
		System.out.printf("%d",myInt);
		System.out.printf("%f",myDouble);
		

		//[width]
		// minimum number of characters to be written as output
		System.out.printf("Hello %1s",myString);

		
		//[precision]
		// sets number of digits of precision when outputting floating-point values
		System.out.printf("You have this much money %.1f",myDouble);

		
		// [flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000

		System.out.printf("You have this much money %,f",myDouble);
    }
}

