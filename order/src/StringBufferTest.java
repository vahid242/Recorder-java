//wap stringBuffer class
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer subject = new StringBuffer("object language");
        System.out.println(subject);
        subject.append("-java");
        System.out.println(subject);
        subject.insert(subject.indexOf("language"),
                "oriented programming ");
        System.out.println(subject);
        subject.setLength(19);
        System.out.println(subject);
        subject.setLength(6);
        System.out.println(subject);
        subject.setLength(15);
        System.out.println(subject);
    }
}
