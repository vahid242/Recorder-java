public class MainUsingThisClass
{
    public static void main(String[] args) {
//        creating object using default constructor
        ClassUsingThis obj1 = new ClassUsingThis();
        System.out.println("Area using def cons " + obj1.area());
        obj1.setLength();
        obj1.setWidth();
        System.out.println("Area using def cons " + obj1.area());
//        creating object using par. const.
        ClassUsingThis obj2 = new ClassUsingThis(3,4);
        System.out.println("Area using def cons " + obj2.area());
    }
}
