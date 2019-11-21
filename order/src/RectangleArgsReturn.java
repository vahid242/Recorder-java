public class RectangleArgsReturn
{
        public static float areas(float l, float w)
        {
            float area = l * w;
            return area;

        }
        public static float perimeter(float l, float w)
        {
            float per = 2*(l * w);
            return per;
        }

        public static void input()
        {
            float length, width;
            Scanner input  = new Scanner(System.in);
            System.out.println("enter width");
            width = input.nextInt();
            System.out.println("enter length");
            length = input. nextInt();
            System.out.println(areas(length,width));
            System.out.println(perimeter(length,width));

        }

        public static void main(String[] args)
        {
            input();
        }
    }

