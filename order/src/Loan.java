import java.util.Scanner;

public class Loan
{
    private float principal, interest, totalAmount;
    public final float RATE = 2.5f;
    private int time;
    Loan()
    {
        time=0;
    }
    Loan(float principal, int tm){
        this.principal = principal;
        time=tm;
    }
    public float getPrinciple()
    {
        return principal;
    }
    public float getRATE()
    {
        return RATE;
    }
    public int getTime()
    {
        return time;
    }
//    set method
    public void setPrincipal(float p)
    {
        principal=p;
    }
    public void setTime(int t)
    {
        time=t;
    }
    public void input()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("input principal");
//        principal = input.nextInt();
        setPrincipal(input.nextInt());
        System.out.println("input time");
//        time = input.nextInt();
        setTime(input.nextInt());
    }
    public float calcInterest(){
        interest = principal *
        (float) Math.pow((1+RATE/100),time) - principal;
        return interest;
    }
    public float calcAmount(){
        totalAmount = principal * ((float)Math.pow((1+RATE/100),time));
        return totalAmount;
    }
}
