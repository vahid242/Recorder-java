//wap to calculate and show a bill for parking charge
import java.util.Scanner;
public class Program2
{
    public static void main(String[] args)
    {
        float hours, chargeableHours, totalRate=0.0f;
        String member = "";
        final int MEMBER_RATE = 1;
        final int NO_MEMBER_RATE = 2;
        final float MORE_RATE = 1.50f;

//        enter input
        System.out.println("how much time stay? ");
        Scanner input = new Scanner(System.in);
        hours = input.nextFloat();


//        calculate
        chargeableHours =(float) Math.ceil(hours);

        if(hours <= 15)
        {
            System.out.println("Whether Customer has a special membership card?");
            member = input.next();
            if (member.equals("yes"))
            {
                totalRate = MEMBER_RATE * chargeableHours;
                System.out.println("Hourly rate: $" + MEMBER_RATE);
            }
            else
            {
                totalRate = NO_MEMBER_RATE * chargeableHours;
                System.out.println("Hourly rate: $" + NO_MEMBER_RATE);
            }
        }
        else if (hours > 15)
        {
            totalRate = MORE_RATE * chargeableHours;
            if (totalRate <= 120 )
            {
                totalRate = totalRate;
                System.out.println("Hourly rate: $" + MORE_RATE);
            }
            else
            {
                totalRate = 120;
                System.out.println("Hourly rate: $" + MORE_RATE);
            }
        }
        System.out.println("Number of hours charged: " + chargeableHours);
        System.out.println("Total charged: $" +totalRate);
    }
}
