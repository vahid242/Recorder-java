//wap prompt a number and convert to bianery, octal, hexa
import java.util.Scanner;
public class Convert {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        num = input.nextInt();

        String hex = Integer.toString(num, 16);
//        String bin = Integer.toString(num, 2);
////        String hex = Integer.toHexString(num);
////        String oct = Integer.toOctalString(num);
////        String bin = Integer.toBinaryString(num);
//        System.out.println("Hex "+hex);
////        System.out.println(oct);
//        System.out.println("Binary "+bin);

    }
}