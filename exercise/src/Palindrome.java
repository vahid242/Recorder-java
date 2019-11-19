import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        StringBuffer word = new StringBuffer("");
        StringBuffer newWord = new StringBuffer("");
        Scanner input = new Scanner(System.in);
        word.append(input.nextLine());
        for(int i= (word.length() - 1); i >= 0; i--)
        {
            newWord.insert(0, word.charAt(i));
        }
        if(newWord.compareTo(word) == 0)
        {
            System.out.println(word + " is palindrome");
        }
        else
        {
            System.out.println(word + " is not palindrome");
        }
        System.out.println(newWord);
        System.out.println(word);

//        int num;
//        String word = "";
//        StringBuffer newWord = new StringBuffer("");
//        Scanner input = new Scanner(System.in);
//        System.out.println(" enter a number");
//        num = input.nextInt();
//        word = Integer.toString(num, 10);
//        for(int i= (word.length() - 1); i >= 0; i--)
//        {
//            newWord.insert(0, word.charAt(i));
//        }
//        if(newWord.equals(word))
//        {
//            System.out.println(word + " is palindrome");
//        }
//        else
//        {
//            System.out.println(word + " is not palindrome");
//        }
//        System.out.println(newWord);
    }
}
