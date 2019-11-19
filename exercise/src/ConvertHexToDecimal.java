// wap convert decimal hex to decimal
//16 = 6 * 16^0 n + 1 * 16^1
public class ConvertHexToDecimal
{
    public static void main(String[] args)
    {
        int num = 24, digit = 0, sum = 0;
        for (int i = 0; num > 0; i++)
        {
            digit = num % 10;
            num = num / 10;
            sum += digit * ((int) Math.pow(16, i));
        }
        System.out.println(sum);
    }
}
