public class StarShape
{
    public static void main(String[] args)
    {
        int line=9;
        for(int i = 0; i <= line/2; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for(int i=line/2 ; i > 0; i--){
            for(int j=i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
