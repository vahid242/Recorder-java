//wep to convert dec to hex
//number / 16
public class ConvertToHex
{
    public static void main(String[] args)
    {
        int num = 987, leftOver;
        String hex;
        StringBuffer digit = new StringBuffer("");
        for (int i = 0; num > 0; i++)
        {
            leftOver = num % 16;
            switch (leftOver)
            {
                case 10:
                    hex = "A";
                    break;
                case 11:
                    hex = "B";
                    break;
                case 12:
                    hex = "C";
                    break;
                case 13:
                    hex = "D";
                    break;
                case 14:
                    hex = "E";
                    break;
                case 15:
                    hex = "F";
                    break;
                default:
                    hex = Integer.toString(leftOver);
            }
            num = num / 16;
//            digit += (hex * Math.pow(10, i));
            digit.insert(0, hex);
        }
        System.out.println(digit);
    }
}
