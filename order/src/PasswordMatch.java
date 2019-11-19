//wap toask user to input password
//then ask to input confirm password
//match them
import java.util.Scanner;

public class PasswordMatch {

    public static void main(String[] args) {
        String pass1, pass2, msg;
        Scanner input = new Scanner(System.in);
//        input
        System.out.println("enter password");
        pass1 = input.next();
        System.out.println("confirm password");
        pass2 = input.next();
//proc
//        msg = (pass1.equalsIgnoreCase(pass2) && (pass1.length()>=8))?
        msg = (pass1.compareTo(pass2) == 0 && (pass1.length()>=8))?
        " password correct":
        "Something is wrong";
//        output
        System.out.println(msg);
    }
}
