import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        float Math, Web, Data, Java, Culture, Communicate,
        average, total;
        Scanner input = new Scanner(System.in);
//        prompt user
        System.out.println("enter grade Math: ");
        Math = input.nextFloat();
        System.out.println("enter grade WEB: ");
        Web = input.nextFloat();
        System.out.println("enter grade data: ");
        Data = input.nextFloat();
        System.out.println("enter grade java: ");
        Java = input.nextFloat();
        System.out.println("enter grade Culture: ");
        Culture = input.nextFloat();
        System.out.println("enter grade Communicate: ");
        Communicate = input.nextFloat();

//        process
        total = Math + Web + Data + Java + Culture + Communicate;
        average = total / 6;
        String res = (average < 50)?("fail"):("pass");
//        output
        System.out.println("total is: " + total);
        System.out.println("average is: " + average);
        System.out.println("status: " + res);

    }
}
