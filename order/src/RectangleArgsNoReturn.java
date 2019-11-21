import java.util.Scanner;
public class RectangleArgsNoReturn
{
    public static void area(float l, float w)
    {
        float area = l * w;
        System.out.println("Area is " + area);
        perimeter(l,w);
    }
    public static void perimeter(float l, float w)
    {
        float per = 2*(l * w);
        System.out.println("perimeter is " + per);
    }

    public static void input()
    {
        float length, width;
        Scanner input  = new Scanner(System.in);
        System.out.println("enter width");
        width = input.nextInt();
        System.out.println("enter length");
        length = input. nextInt();
        area(length,width);
    }

    public static void main(String[] args)
    {
        input();
        System.out.println("finish");
    }
}
