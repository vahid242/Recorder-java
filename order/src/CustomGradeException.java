import java.util.*;
public class CustomGradeException
{
    public static void main(String[] args) {
        int grades;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Grades between 0-100");
        try {
            grades = input.nextInt();
            if (grades < 0 || grades >100)
            {
                throw(new Exception("Grade can't be below 0 or above 100"));
            }
        }
        catch (InputMismatchException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
