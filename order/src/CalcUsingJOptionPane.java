import javax.swing.JOptionPane;
public class CalcUsingJOptionPane
{
    public static void main(String[] args) {
        int num1, num2;
        char op;
        while (true)
        {
            num1=Integer.parseInt(
                    JOptionPane.showInputDialog("input num1"));
            num2=Integer.parseInt(
                    JOptionPane.showInputDialog("input num2"));
            op=JOptionPane.showInputDialog("Enter Operator: \n + for add \n - " +
                    "for subtract").charAt(0);
            switch (op)
            {
                case '+':
                    JOptionPane.showMessageDialog(null, "sum is " + (num1+num2));
                    break;
                case '-':
                    JOptionPane.showMessageDialog(null, "different is " + (num1-num2));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "wrong Operator");
                    break;
            }
            if (JOptionPane.showConfirmDialog(null, "sure to Exit??",
                   "Exit", JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION)
            {
                System.exit(0);
            }
        }
    }
}
