import java.util.Scanner;
public class GreatestCommonDivisor
{
    public static void main(String[] args)
    {
        int num1, num2, gcd = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        num1 = input.nextInt();
        System.out.println("enter a number");
        num2 = input.nextInt();
        for (int i=1; i <= num1 && i <= num2; i++)
        {
            if ( num1 % i == 0 && num2 % i == 0)
            {
                gcd = i;
            }
        }
        System.out.println("gcd " + gcd);
    }
}
