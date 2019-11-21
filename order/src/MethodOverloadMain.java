public class MethodOverloadMain
{
    public static void main(String[] args) {
        try
        {
            System.out.println(MethodOverloadSum.sum(2, 4));
        }
        catch (ArithmeticException e)
        {
            System.out.println("cannot divide number by 0");
        }
        System.out.println(MethodOverloadSum.sum(2,4.0f));
        System.out.println(MethodOverloadSum.sum(2,4,3));
        System.out.println(MethodOverloadSum.sum(5,4));
    }
}
