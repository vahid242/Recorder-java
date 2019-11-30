import java.util.Scanner;
public class LoanMain
{
    public static void main(String[] args) {
        Loan loanObj=new Loan();
        loanObj.input();
        System.out.println("interest " + loanObj.calcInterest());
        System.out.println("Total Amount " +loanObj.calcAmount());
//        second way
        Loan loanObj2 = new Loan(100,10);
        System.out.println("interest " + loanObj2.calcInterest());
        System.out.println("Total Amount " +loanObj2.calcAmount());
//        3rd way
        Loan loanObj3=new Loan();
        Scanner input = new Scanner(System.in);
        System.out.println("input principal");
        loanObj3.setPrincipal(input.nextInt());
        System.out.println("input time");
       loanObj3.setTime(input.nextInt());
        System.out.println("interest " + loanObj3.calcInterest());
        System.out.println("Total Amount " +loanObj3.calcAmount());
    }
}
