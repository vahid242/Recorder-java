import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int num, digit, leftOver, rev=0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter four digit number ");
        num = input.nextInt();
//        4th digit
        digit = num % 10;
        leftOver = num / 10;
        rev = 10 * rev + digit;
//        3rd digit
        digit = leftOver % 10;
        leftOver = leftOver / 10;
        rev = 10 * rev + digit;
//        2nd digit
        digit = leftOver % 10;
        leftOver = leftOver / 10;
        rev = 10 * rev + digit;
//        1st digit
        digit = leftOver % 10;
        leftOver= leftOver / 10;
        rev = 10 * rev + digit;
        if(num  == rev)
        {
            System.out.println("it is a palindrome");
        }
        else
        {
            System.out.println("it is not a palindrome");

        }
    }
}
