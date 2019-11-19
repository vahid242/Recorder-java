import java.util.Arrays;
public class ArraySort
{
    public static void main(String[] args)
    {
        int[] arr = {9,5,3};

        System.out.println("sort");
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("reverse");
        for(int i = ((arr.length) - 1); i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}
