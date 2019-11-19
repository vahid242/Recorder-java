import java.util.Scanner;
public class LeapYear
{
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number ");
        num = input.nextInt();
        if(num % 4 == 0 && num % 100 != 0 || num % 400 == 0) {
            System.out.println(" is leap");
        }
        else{
            System.out.println("is not leap");
        }
    }
}
