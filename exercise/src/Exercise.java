import java.util.Scanner;

public class Exercise
{
    public static void main(String[] args)
    {
        int age;
        String name;
        char charName;

//        create an object of scanner
        Scanner input = new Scanner(System.in);

//        prompt  the user enter name and age
        System.out.println("enter name and age");
        name = input.next();
        age = input.nextInt();
        charName = name.charAt(0);

//        print results
        System.out.println("name: " + name);
        System.out.println("age: " +age );
        System.out.println("first character of name: " + charName);


    }
}

