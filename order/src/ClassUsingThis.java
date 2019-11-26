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
    int area()
    {
        return length * width;
    }
}
