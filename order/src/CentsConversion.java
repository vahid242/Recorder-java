//war to ask user to input how many cents he is having
//in their packet
//output should be cents will form how many quarters(25)
//diamond(10) nickles(5) and and pennies(1)
import java.util.Scanner;

public class CentsConversion {
    public static void main(String[] args) {
        float cent, leftOver;
        Scanner input = new Scanner(System.in);
        System.out.println("enter money as cent");
        cent = input.nextInt();

        int quarter =(int) cent / 25;
        leftOver = cent % 25;
        int diam=(int) leftOver / 10;
        leftOver = leftOver % 10;
        int nic =(int) leftOver / 5;
        leftOver = leftOver % 5;
        int pen = (int)leftOver;
        System.out.println("quarter: " + quarter);
        System.out.println("diamond: " + diam);
        System.out.println("nic: " + nic);
        System.out.println("pen: " + pen);
    }
}
