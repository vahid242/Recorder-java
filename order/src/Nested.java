public class Nested
{
    public static void main(String[] args) {
        int i =5, j=7, k=3;
        if(i > j)
        {
            if(i > k)
            {
                System.out.println(i);
            }
            else
            {
                System.out.println(k);
            }
        }
        else if (j > k)
        {
            System.out.println(j);
        }
        else
        {
            System.out.println(k);
        }
    }
}
