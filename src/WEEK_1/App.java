package WEEK_1;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //swap variables manually
        String x = "Hello";
        String y = "World";
        int rows;
        int columns;
        String symbol = "";

        
        //accept user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("name: ");
        String name = scanner.nextLine();
        System.out.println("Age");
        int age =scanner.nextInt();
        scanner.nextLine();
        System.out.println("Favorite Color");
        String color = scanner.nextLine();

        System.out.println("Enter number for summation\n");

        System.out.println("Num1");
        int num1 = scanner.nextInt();
        // char operator = scanner.next().charAt(0);
        System.out.println("Num2");

        int num2 = scanner.nextInt();
        scanner.nextLine();

        Biodata biodata = new Biodata(name, age, color);
        Quiz quiz = new Quiz(num1, num2);

        System.out.println("Enter # row: ");
        rows = scanner.nextInt();
        System.out.println("Enter # column: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol: ");
        symbol = scanner.next();

        scanner.close();

        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= columns; j++)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }
        
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }

        // hollow square
        for(int i = 0; i < rows; i++)
        {
            
            for(int j = 0; j < columns; j++)
            {
                // System.out.print(symbol);
                if(i==0 || i == rows - 1)
                {
                    System.out.print(symbol);
                }
                else
                {
                    if(j == 0 || j == columns - 1)
                    {
                        System.out.print(symbol);
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        // return res;
        //left stair
        for(int i = 0; i < rows; i++)
        {
            for(int j = 1; j < rows-i; j++)
            {
                System.out.print("+");
            }
            
            for(int k = 0; k <= i; k++)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }
    

        // System.out.println("How old are you?");

        // System.out.println("What is your favorite color?");
        // System.out.println("Test" + biodata);
        biodata.PrintBio();
        quiz.CheckAnswer();

        // System.out.println("Hello " + name);
        // System.out.println("You are " + age + " years old");
        // System.out.println("Your favorite color is " + color);

        //if language doesn't support swap variables use this
        String temp = x;
        x = y;
        y = temp;
        
        System.out.println(x + " " + y);
    }
}

class Biodata
{
    String name;
    int age;
    String color;

    Biodata(String name, int age, String color)
    {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void PrintBio()
    {
        System.out.println("Hello " + this.name);
        System.out.println("You are " + this.age + " years old");
        System.out.println("Your favorite color is " + this.color);
    }
}

//salah
class Quiz
{
    int num1;
    int num2;
    // char operator;
    int answer;

    Quiz(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
        // this.operator = operator;
    }

    void CheckAnswer()
    {
        answer = num1  + num2;
        System.out.println(this.num1 + this.num2 + " + " + " answer: " + this.answer);
    }
}
