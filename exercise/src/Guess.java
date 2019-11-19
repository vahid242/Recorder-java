import java.util.Scanner;
public class Guess
{
    public static void main(String[] args)
    {
        int sum;
        Scanner input = new Scanner(System.in);
        System.out.println("what is the result of 5 + 9 ?");
        sum = input.nextInt();
        while (sum != 5 + 9)
        {
            System.out.println("Wrong number. " +
                    "what is the result of 5 + 9 ?");
            sum = input.nextInt();
        }
        System.out.println("you win");
    }
}
