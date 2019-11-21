public class MethodOverloadMain
{
    public static void main(String[] args) {
        System.out.println(MethodOverloadSum.sum(2,4));
        System.out.println(MethodOverloadSum.sum(2,4.0f));
        System.out.println(MethodOverloadSum.sum(2,4,3));
        System.out.println(MethodOverloadSum.sum(5,4));
    }
}
