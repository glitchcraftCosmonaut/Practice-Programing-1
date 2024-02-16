package WEEK_1;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTextField;


import java.util.Random;

public class GUIExample
{
    public static void main(String[] args)
    {
        
        //make selection
        Object[] menuObjects = {"Hypotenuse", "Calculator", "random quiz","Car Parking"};
        String[][] cars = new String[3][3];
        Random random = new Random();
        int score = 0;
        String name = JOptionPane.showInputDialog("What is your name?");
        //if user input is empty
        while (name.isEmpty())
        {
            name = JOptionPane.showInputDialog("What is your name?");
        }

        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        String menuSelect = (String)JOptionPane.showInputDialog(null,"Select an option", "Menu", 
            JOptionPane.QUESTION_MESSAGE, null, menuObjects, menuObjects[0]);

        
        switch(menuSelect)
        {
            case "Hypotenuse":
                    int n = JOptionPane.showConfirmDialog(null,"Next program is to calculate the hypotenuse of triangle");

                    if (n == JOptionPane.YES_OPTION)
                    {
                        // JOptionPane.showMessageDialog(null, "Enter length of side a and b");
                        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter length of side a"));
                        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter length of side b"));
            
                        JOptionPane.showMessageDialog(null, "Hypotenuse is " + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
                    }
                    else
                    {
                        return;
                    }
                break;
            case "Calculator":
                int simple = JOptionPane.showConfirmDialog(null, "Next program is simple calculator, proceed?");
                if (simple == JOptionPane.YES_OPTION)
                {
                    // JOptionPane.showMessageDialog(null, "Enter length of side a and b");
                    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first Number"));
                    char operator =  JOptionPane.showInputDialog("Enter Operator +, -, *, /, %").charAt(0);
                    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number"));
                    int result;
                    switch (operator)
                    {
                        case '+':
                            result = num1 + num2;
                            JOptionPane.showMessageDialog(null,"Operation: "+ num1 + " + " + num2 +" = "+ result);
                            break;
                        case '-':
                            result = num1 - num2;
                            JOptionPane.showMessageDialog(null,"Operation: "+ num1 + " - " + num2 +" = "+ result);
                            break;
                        case '*':
                            result = num1 * num2;
                            JOptionPane.showMessageDialog(null,"Operation: "+ num1 + " X " + num2 +" = "+ result);
                            break;
                        case '/':
                            result = num1 / num2;
                            JOptionPane.showMessageDialog(null,"Operation: "+ num1 + " / " + num2 +" = "+ result);
                            break;
                        case '%':
                            result = num1 % num2;
                            JOptionPane.showMessageDialog(null,"Operation: "+ num1 + " % " + num2 +" = "+ result);
                            break;
                        default: JOptionPane.showMessageDialog(null,"ERROR WRONG OPERATOR!");
                            break;
                    }
                }
                else 
                {
                    return;
                }
                break;
            case "random quiz":
                int quiz = JOptionPane.showConfirmDialog(null, "Next is simple multiplication quiz, proceed?");
                if (quiz == JOptionPane.YES_OPTION)
                {
                    // JOptionPane.showMessageDialog(null, "Enter length of side a and b");
                    int num1 = 2;
                    int num2 = 2;
                    int number = 0;
                    int result;
        
                    // result = num1 * num2;
                    // int answer = Integer.parseInt(JOptionPane.showInputDialog(null,"Your Score: "+ score + "\n"+ num1 + " * " + num2 + " = "));
                    for(int i = 0;i < 10;i++)
                    {
                        number++;
                        for(int j = 0; j < 10; j++)
                        {
                            num1 = random.nextInt(19) + 1;
                            num2 = random.nextInt(19) + 1;   
                        }
                        int answer = Integer.parseInt(JOptionPane.showInputDialog(null,"Question: "+ number +"\nYour Score: "+ score + "\n"+ num1 + " * " + num2 + " = "));
                        // JOptionPane.showMessageDialog(null,"Your Score: "+ score + "\n"+ num1 + " * " + num2 + " = " + result);
                        // answer++;
                        result = num1 * num2;
                        // nomor++;
                        if(answer == result)
                        {
                            JOptionPane.showMessageDialog(null, "Correct!");
                            score +=10;
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Incorrect! the correct answer is" + result);
                        }
                    }

                
                    // while (answer == result)
                    // {
                    //     answer = Integer.parseInt(JOptionPane.showInputDialog(null,"Your Score: "+ score + "\n"+ num1 + " * " + num2 + " = "));    
                    // }
                    // double a = Double.parseDouble(JOptionPane.showInputDialog("Enter length of side a"));
                    // double b = Double.parseDouble(JOptionPane.showInputDialog("Enter length of side b"));
                }
                else
                {
                    return;
                }
                break;
            case "Car Parking":
                int car = JOptionPane.showConfirmDialog(null, "Next is car parking, proceed?");
                if(car == JOptionPane.YES_OPTION)
                {
                    JPanel panel = new JPanel(new GridLayout(cars.length, cars[0].length));
                    JTextField[] textFields = new JTextField[cars.length * cars[0].length];
                    int index = 0;
                    // StringBuilder carsString = new StringBuilder();
                    // int i;
                    // int j;
                    // JOptionPane.showMessageDialog(null);
                    // String carName = JOptionPane.showInputDialog("Enter car name");
                    for(int i = 0; i < cars.length; i++)
                    {
                        for(int j = 0; j < cars[i].length; j++)
                        {
                            // JTextField texBox = new JTextField(cars[i][j]);
                            // panel.add(texBox);
                            // panel.add(texBox);
                            // carsString.append(cars[i][j] + "\n"); 
                            // panel.add(new JLabel(cars[i][j]));
                            // String carName = JOptionPane.showInputDialog("Enter car name");
                            // String carName = JOptionPane.
                            // cars[i][j] = carName;
                            // JOptionPane.showMessageDialog(null, panel);
                            textFields[index] = new JTextField(cars[i][j]);
                            textFields[index].setColumns(15);
                            textFields[index].setEditable(false);
                            String carName = JOptionPane.showInputDialog("Enter car name");
                            textFields[index].setText(carName);
                            panel.add(textFields[index]);
                            index++;
                        }
                    }
                    JPanel outputPanel = new JPanel();
                    for(JTextField textField : textFields) {
                    outputPanel.add(new JLabel(textField.getText()));
                    }
                    
                    JOptionPane.showMessageDialog(null, panel);
                    JOptionPane.showMessageDialog(null, outputPanel);
                    // JOptionPane.showMessageDialog(null, Arrays.deepToString(cars));
                    // JOptionPane.showMessageDialog(null, "Parked cars: " + Arrays.toString(cars));
                    

                }
                else
                {
                    return;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid selection");
        }

    }    
}
