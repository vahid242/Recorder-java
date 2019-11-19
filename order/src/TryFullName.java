import java.util.Scanner;
public class TryFullName
{
    public static void main(String[] args)
    {
        String fullName;
        Scanner input = new Scanner(System.in);
        System.out.println("enter full name");

//        fullName = input.next();
        fullName = input.nextLine();
        System.out.println("welcome " + fullName);
    }
}
