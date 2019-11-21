import java.util.*;
public class ExceptionClass
{
    public static void main(String[] args)
    {
        int a, b;
        Scanner input  = new Scanner(System.in);
        System.out.println("enter value of a and b");
        try {
            a = input.nextInt();
            b = input.nextInt();
            int result = a / b;
        }
       catch (InputMismatchException e)
        {
            e.printStackTrace();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("some other exception, check ur code");
        }
        finally {
            System.out.println("that's all for first piece of code");
        }
//        another piece of code
        String s ="hello world";
        int ch;
        System.out.println("input char position you wanna see");
        ch = input.nextInt();
        try {
            System.out.println(s.charAt(ch));
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("position is not available");
        }
        //        another piece of code
        int[] arr={3,5,7,1,0};
        for (int i = 0; i <= arr.length; i++)
        {
            try {
                System.out.println("Element" + arr[i]);
            }
            finally {
                System.out.println("good bye!");
            }
        }

    }
}
