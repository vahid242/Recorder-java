import java.util.Scanner;
public class SimpleIfTest
{
    public static void main(String[] args)
    {
        int num;
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter a number ");
//        num = input.nextInt();
////        num = new Scanner(System.in).nextInt();
//        if(num % 5 == 0){
//            System.out.println(" Hi Five");
//        }
//        if(num % 2 == 0){
//            System.out.println(" Hi Even");
//        }

//        wap to ask what is 7 + 9?
//        if the answer correct say perfect
        Scanner input = new Scanner(System.in);
        System.out.println("what is 7 + 9");
        num = input.nextInt();
        if(num == (7+9))
        {
            System.out.println("perfect");
        }
        else
        {
            System.out.println("wrong");
        }
    }
}
