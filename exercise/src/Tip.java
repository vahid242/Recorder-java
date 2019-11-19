import java.util.Scanner;
public class Tip
{
    public static void main(String[] args)
    {
        float tipAmount, tipPercent, billAmount;
//        prompt user input
        Scanner input = new Scanner(System.in);
        System.out.println("enter bill Amount");
        billAmount = input.nextFloat();
        System.out.println("enter tip percent");
        tipPercent = input.nextFloat();
//        process
        tipAmount = (tipPercent / 100) * billAmount;

//        print out put
        System.out.println("amount of tip is: " + tipAmount + "$");
        System.out.println("total pay: " + (tipAmount + billAmount + "$"));
    }
}
