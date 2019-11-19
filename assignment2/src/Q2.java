//wap to display flip of a coin
public class Q2 {
    public static void main(String[] args) {
        int res = (int)Math.round(Math.random());
        String showResult = (res == 1)?("You Win"):("Better Luck Next Time");
        System.out.println(showResult);
    }
}
