import java.util.Scanner;
public class SumOfSeriesReturntype
{
    public int sumSeries()
    {
        int minRange = 0, maxRange = 0, total= 0;
        Scanner input  = new Scanner(System.in);
        System.out.println("enter starting range");
        minRange = input.nextInt();
        System.out.println("enter ending range");
        maxRange = input. nextInt();

        for (int i = minRange; i <= maxRange; i++){
            total+=i;
        }
        return total;
    }

    public static void main(String[] args)
    {
//        1st way 1-10
        SumOfSeriesReturntype obj = new SumOfSeriesReturntype();
        System.out.println(obj.sumSeries());
//        2nd way 20-30
        int result=obj.sumSeries();
        System.out.println(result);
//        any way out of above2 - 30-40
        result=obj.sumSeries();
        System.out.println(result);

    }
}
