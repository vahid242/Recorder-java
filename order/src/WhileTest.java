public class WhileTest
{
    public static void main(String[] args)
    {
//        int count = 4;
//        while (count <= 9)
//        {
//            System.out.println(count);
//            count++;
//        }
        int sum = 0;
        int number = 0;
        while (number < 20)
        {
            number++;
            if (number == 10 || number == 11)
                continue;
            sum += number;
        }
        System.out.println("The sum is " + sum);
    }
}
