public class WrapperMethod {
    public static void main(String[] args) {
        String num = "3";
        String sample = "true";
        String hexNum = "b";
        int decNum = 9;
        int num2 = 14;
        char symbol = 'r';
        String flNum = "2.5f";
        int num1 = Integer.parseInt(num);
        boolean sample1 = Boolean.parseBoolean(sample);
        int hexNum1 = Integer.valueOf(hexNum, 16);
        String decNum1 = Integer.toString(decNum, 2);
        String num2_2 = Integer.toHexString(num2);
        float flNum1 = Float.valueOf(flNum);
        System.out.println(num1);
        System.out.println(sample1);
        System.out.println(hexNum1);
        System.out.println(decNum1);
        System.out.println(num2_2);
        System.out.println(Character.isDigit(symbol));
        System.out.println(Character.isLetter(symbol));
        System.out.println(flNum1);

//        System.out.println(typeOf(num1));
    }
}
