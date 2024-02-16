package WEEK_1;
import java.util.ArrayList;
import java.util.Scanner;


/** this program is implement all the practice form week 1
 * use all known java concepts from week 1 as much as possible
 * program prompt:
 * 1. Create program that draw a hollow heart shape
 * 2. User choose symbol that draw heart line
 * 3. outside the line its filled by placeholder symbol from code
 * 4. (Optional) User can resize the heart shape
 */



public class FirstProgram 
{
    public static void main(String[] args) 
    {
        final int size = 5;
        //using 5x5 dimension
        Scanner scanner = new Scanner(System.in);
        // System.out.println("size of shape(FIXED): " + size);
        System.out.printf("size of shape(FIXED): %1d\n",size);
        // int size = scanner.nextInt();
        // scanner.nextLine();
        System.out.println("Enter symbol: ");
        char symbol = scanner.next().charAt(0);
        // int symbol = scanner.nextInt();

        scanner.nextLine();

        shape(size, symbol);
        scanner.close();

    }

    static int shape(int size, char symbol) 
    {
        ArrayList<ArrayList<Character>> list2DArrayList = new ArrayList<ArrayList<Character>>();
        ArrayList<Character> list = new ArrayList<Character>();
        // int num =0;
        for (int j = 0; j < size; j++) 
        {
            // list2DArrayList.add(list);
            list2DArrayList.add(j, list);
        }
        for (int i = 0; i < size; i++) 
        {
            // for(int j = 0; j < size; j++)
            // list2DArrayList.get(size - 1).add(i);
            // list2DArrayList.get(0);
            // list2DArrayList.get(i).add(i, symbol);
            // for(int j = 0; j < size; j++)
            // {

            // }
            if(list2DArrayList.get(i).get(i) == list2DArrayList.get(0).get(0))
            {
                list2DArrayList.get(i).add(i, symbol);
            }
            else
            {
                list2DArrayList.get(i).add(i, '0');
            }
            
                // if(list.get(i) == 0)
                
                
        }
        // for(int k = 0; k < size; k++)
        // for(Character i : list)
        // {
        //     System.out.println(i);
        // }
        for (ArrayList<Character> i : list2DArrayList) 
        { 
            // System.out.printf("%2s",i);
            System.out.println();
            for(Character j : i)
            {
                System.out.printf("%2s",j);
            }
        }
        System.out.println(list2DArrayList.get(0));
        return list2DArrayList.size();
    }
}

