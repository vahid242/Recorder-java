import java.util.Scanner;

public class Tic_Tac_Toe {
    public static void main(String[] args) {
        int [][] board = new int[3][3];
        int sum1=0;
        System.out.println("welcome to the TTT game");
        for (int i=0; i<3;i++){
            for (int j=0; j<3; j++){
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
        }
//        ask user enter 9 numbers
        for (int i=0; i<3;i++){
            for (int j=0; j<3; j++) {
                System.out.print("enter 1 or -1:");
                Scanner input = new Scanner(System.in);
                board[i][j] = input.nextInt();
            }
        }
        for (int i=0; i<3;i++){
            for (int j=0; j<3; j++){
                if (board[i][j] == 1){
                    System.out.print("x|");
                }
                else {
                    System.out.print("o|");
                }
            }
            System.out.println();
        }
//        row sum
        for (int i=0; i<3;i++){
            for (int j=0; j<3; j++){
                sum1+=board[i][j];
            }
            if (sum1 == 3){
                break;
            }
            else if (sum1 == -3){
                break;
            }
            else {
                sum1=0;
            }
        }
//        col sum
        if (sum1 == 0){
            for (int i=0; i<3; i++){
                for (int j=0; j<3; j++){
                    sum1+=board[j][i];
                }
                if (sum1 == 3){
                    break;
                }
                else if (sum1 == -3){
                    break;
                }
                else {
                    sum1=0;
                }
            }
        }

//        \/ sum
        if (sum1 == 0){
            sum1 = board[0][0] + board[1][1] + board[2][2];
            if (sum1 == 3){
                sum1 =3;
            }
            else {
                sum1=0;
            }
        }
        if (sum1 == 0){
            sum1 = board[0][2] + board[1][1] + board[2][0];
            if (sum1 == -3){
                sum1=-3;
            }
            else {
                sum1=0;
            }
        }
        System.out.println("sum is :" + sum1);
        switch (sum1){
            case 3:
                System.out.println("x win");
                break;
            case -3:
                System.out.println("o win");
                break;
            default:
                System.out.println("draw");
        }

    }
}
