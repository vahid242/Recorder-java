public class FutureTuition
{
    public static void main(String[] args)
    {
        float tuition = 10000.0f;
        int count = 0;
        while (tuition <= 20000 )
        {
            tuition = tuition * 1.07f;
            count++;
        }
        System.out.println(count);
    }
}
