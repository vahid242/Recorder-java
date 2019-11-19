import java.util.Scanner;
public class ArraySortMethod
{
    public static void arraySort()
    {
        int[] nums = new int[5];
        Scanner input  = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++)
        {
            System.out.println("enter a number");
            nums[i] = input.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
//                    swap the number
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int val:nums)
        {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        arraySort();
    }
}
