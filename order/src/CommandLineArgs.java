public class CommandLineArgs {
    public static void main(String[] args) {
        int num1, num2, num3;
        float total, average;
        final float DATA_NUM = 3;
        num1= Integer.parseInt(args[0]);
        num2= Integer.parseInt(args[1]);
        num3= Integer.parseInt(args[2]);
        total = num1 + num2 + num3;
        average = total / DATA_NUM;
        System.out.println("total " + total);
        System.out.println("Average " + average);
    }
}

