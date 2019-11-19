import java.util.Scanner;
public class RectangleMethod
{
    public static void area()
    {
        int length, width, area;
        Scanner input  = new Scanner(System.in);
        System.out.println("enter length");
        length = input.nextInt();
        System.out.println("enter width");
        width = input.nextInt();
        area = length * width;
        System.out.println("area is " + area);

    }
    public static void perimeter()
    {
        int length, width, perimeter;
        Scanner input  = new Scanner(System.in);
        System.out.println("enter length");
        length = input.nextInt();
        System.out.println("enter width");
        width = input.nextInt();
        perimeter = (2 * length) + (2 * width);
        System.out.println("perimeter is " + perimeter);
    }
    public static void main(String[] args)
    {
        area();
        perimeter();
    }
}
