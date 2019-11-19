//wap to show the amount of money to pay an employee
import java.util.Scanner;
public class Program1
{
    public static void main(String[] args)
    {
        int type;
        float salary, pay, hours;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter type of employee:");
        System.out.println("1. Full-Time");
        System.out.println("2. Part-Time");
        System.out.println("3. Sessional");
        System.out.println("4. Partial Load");
        type = input.nextInt();

        if(type == 1)
        {
            System.out.println("Enter Salary:");
            salary = input.nextFloat();
            pay = salary / 44;
            System.out.printf("Total Pay: %.2f %n", pay);
        }
       else if(type == 2)
        {
            System.out.println("Enter Hours Worked:");
            hours = input.nextFloat();
            pay = hours * 30;
            System.out.printf("Total Pay: %.2f %n", pay);
        }
        else if(type == 3)
        {
            System.out.println("Enter Hours Worked:");
            hours = input.nextFloat();
            pay = hours * 32;
            System.out.printf("Total Pay: %.2f %n", pay);
        }
        else if(type == 4)
        {
            System.out.println("Enter Hours Worked:");
            hours = input.nextFloat();
            pay = hours * 35;
            System.out.println("Total Pay: " + pay);
        }
        else
        {
            System.out.println("Error! You entered an invalid employee type.");
        }
    }
}
