import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        String pass;
        String msg;
        Scanner input = new Scanner(System.in);
//        input
        System.out.println("Enter Password");
        pass = input.next();
//        processing
        msg = (pass.length()>=8)?"Correct Password":
                "Incorrect password";
//        output
        System.out.println(msg);
    }
}
