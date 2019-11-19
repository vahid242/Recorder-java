import java.util.Scanner;
public class GussNumber
{
    public static void main(String[] args) {
        int num = 38, guess;
        Scanner input = new Scanner(System.in);
        System.out.println("guess a number between 1 to 100: ");

        while (true) {
            guess = input.nextInt();
            if (guess < num) {
                System.out.println("low");
            } else if (guess > num) {
            System.out.println("high");
            } else {
                System.out.println(num);
                System.out.println("you win");
                break;
            }
//            System.out.println("Do you like to continue? yes/no");
//            String ans = input.next();
//            if (ans.equals("yes")) {
//                System.out.println("guess a number between 1 to 100: ");
//                guess = input.nextInt();
//            } else {
//                break;
//            }
        }
    }
}
