import javax.swing.JOptionPane;
public class UsingJoptionPanes {
    public static void main(String[] args) {
        int value;
        JOptionPane.showMessageDialog(null, "Welcome to my world","welcome",JOptionPane.INFORMATION_MESSAGE);
//    input
        value = Integer.parseInt(
                JOptionPane.showInputDialog(null, "input value of variable",
                        0));
        JOptionPane.showMessageDialog(null, "you entered \n" + value,
                "output", JOptionPane.INFORMATION_MESSAGE);
        if (JOptionPane.showConfirmDialog(null,
                "sure to exit", "confirmation",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "still in program");
        }
    }
}

