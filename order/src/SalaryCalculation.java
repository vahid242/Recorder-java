import java.util.Scanner;
public class SalaryCalculation
{
    public static void main(String[] ar)
    {
        float hoursWork=0.0f,biWeekPay=0.0f;
        final float HOURLYPAY=14.99f;
        final int weeks=2;
        System.out.println("how many hours you worked");
        Scanner input=new Scanner(System.in);
//        classname objname = new for memory
//        classConstructor with in as input mode
        hoursWork = input.nextFloat();
//        processing
        biWeekPay=hoursWork * HOURLYPAY * weeks;
//        output
        System.out.println("BIWEEKLY Pay is " + biWeekPay);

    }
}
