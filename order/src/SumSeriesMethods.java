import java.util.Scanner;
public class SumSeriesMethods
{
//    void - no return type
//    () are empty so no arguments
    public static void sum()
    {
        int minRange = 0, maxRange = 0, total= 0;
        Scanner input  = new Scanner(System.in);
        System.out.println("enter minimum range");
        minRange = input.nextInt();
        System.out.println("enter maximum range");
        maxRange = input. nextInt();

        for (int i = minRange; i <= maxRange; i++){
            total+=i;
        }
        System.out.println("sum of " + minRange + " to "+ maxRange +
                " is " + total);
    }
    public static void main(String[] args)
    {
        for (int i =0; i < 3; i++)
        {
            sum();
        }

    }
}
