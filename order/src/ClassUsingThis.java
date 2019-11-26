import java.util.Scanner;
public class ClassUsingThis
{
    int length,width;
//    default constructor - no argument
    ClassUsingThis()
    {
        length=0;
        width=0;
    }
//    parametreized constructor - with arguments
    ClassUsingThis(int length, int width)
    {
        this.length=length; //this tells which one is class level arg
        this.width=width;
    }
    Scanner input = new Scanner(System.in);
//    mutator-set-input values
    public void setLength(){
        System.out.println("input length");
        length=input.nextInt();
    }
    public void setWidth(){
        System.out.println("input width");
        width=input.nextInt();
    }
//    accessor methods- get - return output
//    return type should match the variable datatype u wanna return
    public int getLength()
    {
        return length;
    }
    public int getWidth()
    {
        return width;
    }
    int area()
    {
        return length * width;
    }
}
