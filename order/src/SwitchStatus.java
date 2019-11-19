import java.util.Scanner;
public class SwitchStatus
{
    public static void main(String[] args) {
        int status;
        String msg;
        Scanner input = new Scanner(System.in);
        System.out.println("******** Status ********");
        System.out.println("Enter 0 for Single");
        System.out.println("Enter 1 for Married jointly / widow");
        System.out.println("Enter 2 for Married yet separated");
        System.out.println("Enter 3 for household");
        System.out.println("What is your status");
        status=input.nextInt();
        switch(status)
        {
            case 0:
                msg="Compute tax for single";
                break;
            case 1:
                msg="Compute tax either jointly or for widow";
                break;
            case 2:
                msg="Compute tax for married";
                break;
            case 3:
                msg="Compute tax for household";
                break;
            default:
                msg="Invalid status";
        }
        System.out.println(msg);
    }
}
