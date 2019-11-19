//ask five sub result
//output show the amount of correct and incorrect
import java.util.Scanner;
public class SubQuiz
{
    public static void main(String[] args)
    {
        int answer, num1, num2, count=0, correct = 0, temp;
        Scanner input = new Scanner(System.in);

        while (count < 5)
        {
            num1 = (int) (Math.random() * 10);
            num2 = (int) (Math.random() * 10);
            if (num1 < num2)
            {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            System.out.println("what is " + num1  + "-" + num2);
            answer = input.nextInt();
            if (answer == num1 - num2)
            {
                System.out.println(" you are correct");
                correct++;
            }
            else
            {
                System.out.println("you are wrong");
                System.out.println("it should be " + (num1 - num2));
            }
            count++;
        }
        System.out.println("Correct count is " + correct);
    }
}
