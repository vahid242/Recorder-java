import java.util.Scanner;
public class arrayRevision
{
    public static void main(String[] args) {
//        create an array
        int[] numbers = new int[10];
        Scanner input = new Scanner(System.in);
//        take input from user for an array
        for (int i=0; i < numbers.length; i++)
        {
            System.out.println("input element");
            numbers[i] = input.nextInt();
        }
//        print array
        System.out.println("you saved in array");
        for (int i=0; i < numbers.length; i++)
        {
            System.out.println("element at position " + i +
                    " is" + numbers[i]);
        }
    }
}
