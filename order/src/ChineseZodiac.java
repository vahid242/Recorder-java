import java.util.Scanner;
public class ChineseZodiac
{
    public static void main(String[] args)
    {
        int year, reminder;
        String msg="";
        System.out.println("enter the year of your birth:");
        Scanner input = new Scanner(System.in);
        year = input.nextInt();
        reminder = year % 12;
        switch (reminder)
        {
            case 0:
                msg = "monky";
                break;
            case 1:
                msg = "rooster";
                break;
            case 2:
                msg = "dog";
                break;
            case 3:
                msg = "pig";
                break;
            case 4:
                msg = "rat";
                break;
            case 5:
                msg = "ox";
                break;
            case 6:
                msg = "tiger";
                break;
            case 7:
                msg = "rabbit";
                break;
            case 8:
                msg = "dragon";
                break;
            case 9:
                msg = "snake";
                break;
            case 10:
                msg = "horse";
                break;
            default:
                msg = "sheep";
        }
        System.out.println(msg);
    }
}
