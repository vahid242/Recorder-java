public class StarTri
{
    public static void main(String[] args)
    {
        int l=7;
        for(int i=0; i<=l/2; i++)
        {
            for(int j=l/2; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int j=0; j <=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<=l/2; i++)
        {
            for(int j=i; j>0; j--)
            {
                System.out.print(" ");
            }
            for(int j=l/2; j>=i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
