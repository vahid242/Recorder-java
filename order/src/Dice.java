import java.util.Scanner;
public class Dice {
    public static void main(String[] args) {
        float ci;
        float p, time, rate;
        Scanner input = new Scanner(System.in);

//        prompt user enter input
        System.out.println("enter amount");
        p= input.nextFloat();
        System.out.println("enter time");
        time = input.nextFloat();
        System.out.println("enter rate of interest");
        rate = input.nextFloat();
//        process
        ci= (float) (p*Math.pow((1+rate), time));
        System.out.println(ci);
    }
}

