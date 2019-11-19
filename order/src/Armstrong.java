import java.util.Scanner;
public class Armstrong
{
    public static void main(String[] args) {
        int num, digit, leftOver, cube = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter three digit number ");
        num = input.nextInt();

//        3rd
       digit = num % 10;
       leftOver = num / 10;
       cube = cube + (int) Math.pow(digit, 3);
//       2nd
        digit = leftOver % 10;
        leftOver = leftOver / 10;
        cube = cube +(int) Math.pow(digit, 3);
//        1st
        digit = leftOver % 10;
        leftOver = leftOver / 10;
        cube = cube + (int) Math.pow(digit, 3);

        if(num == cube)
        {
            System.out.println("it is Armstrong");
        }
        else
        {
            System.out.println("it is not Armstrong");
        }
    }
}
