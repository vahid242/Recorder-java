import java.util.Scanner;
public class MathTestCalc
{
    public static void main(String[] args)
    {
        int num1, num2, ans;
        String msg;
        do {
            num1 = (int) (Math.random() * 10);
            num2 = (int) (Math.random() * 10);
            System.out.println("what is " + num1 + " + " + num2);
            Scanner input = new Scanner(System.in);
            ans = input.nextInt();
            if (ans == (num1 + num2)) {
                msg = "correct";
            } else {
                msg = "incorrect";
            }
        } while (msg.equals("incorrect"));

    }
}
