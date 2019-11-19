import java.util.Scanner;
public class SwitchTest
{
    public static void main(String[] args) {
        int num;
        System.out.println("enter a number from 1 to 10");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        switch (num)
        {
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("even number");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("odd number");
                break;
            default:
                System.out.println("number out of range");
        }
    }
}
