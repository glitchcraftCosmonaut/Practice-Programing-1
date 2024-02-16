package WEEK_1;
public class ForExe {
    public static void main(String[] args)
    {
        int size = 5;
        for (int i = 0; i < size; i++)
        {
            //hollow pyramid
            // System.out.print(i);
            for(int j = 1; j <= size - i - 1; j++)
            {
                System.out.print(j);
            }
            for(int k = 0; k < 2 * i + 1 ; k++)
            {
                // System.out.print("*");
                if(i == 0)
                {
                    System.out.print("*");
                }
                else
                {
                    if(k == 0 || k == 2 * i)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }



            //reverse pyramid
            // System.out.print(i);
            // for(int j = 1; j <= i; j++)
            // {
            //     System.out.print(j);
            // }
            // for(int k = 0; k < 2 * (size - i) - 1 ; k++)
            // {
            //     System.out.print("*");
            // }
            
            //pyramid
            // for(int j = 1; j <= size - i - 1; j++)
            // {
            //     System.out.print(j);
            // }
            // for(int k = 0; k < 2 * i + 1; k++)
            // {
            //     System.out.print("*");
            // }
            System.out.println();
        }

        //reverse hollow pyramid
        for(int i = 1; i < size; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            for(int k = 2 * (size - i) - 1; k >= 1 ; k--)
            {
                if(k == 1 || k == 2 * (size - i) - 1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
