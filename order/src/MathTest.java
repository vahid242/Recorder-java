import java.util.Scanner;
public class MathTest
{
    public static void main(String[] args)
    {
        float num1, num2, ans = 0;
        char symbol;
        String cont="";
        do {
            Scanner input= new Scanner(System.in);
            System.out.println("enter num1");
            num1 = input.nextFloat();
            System.out.println("enter num2");
            num2 = input.nextFloat();
            System.out.println("***** Enter ****");
            System.out.println(" + for addition");
            System.out.println(" - for subtraction");
            System.out.println(" / for division");
            System.out.println(" * for multi");
            System.out.println(" % for modulus");
            symbol = input.next().charAt(0);
            switch (symbol)
            {
                case '+':
                    ans = num1 + num2;
                    break;
                case '-':
                    ans = num1 - num2;
                    break;
                case '*':
                    ans = num1 * num2;
                    break;
                case '/':
                    ans = num1 / num2;
                    break;
                case '%':
                    ans = num1 % num2;
                    break;
                default:
                    System.out.println("wrong operator");
            }
            System.out.println("Result is " + ans);
            System.out.println("Do you wish to continue");
             cont = input.next();
        }while (cont.equalsIgnoreCase("yes"));
    }
}
