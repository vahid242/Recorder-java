import java.util.Scanner;
import java.util.Arrays;
public class ArraySearchPosition
{
    public static void main(String[] args)
    {
        int arr[] = new int[5];
        int pos = -1;
        Scanner input = new Scanner(System.in);

        System.out.println("enter 5 number");
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("which element you are looking for");
        int search = input.nextInt();
//        for(int i = 0; i < arr.length; i++){
//            if (search == arr[i]) {
//                pos = i;
//                break;
//            }
//        }
//        if(pos == -1){
//            System.out.println("no such element");
//        }
//        else {
//            System.out.println("element is at position " + pos);
//        }

        System.out.println(Arrays.binarySearch(arr,search));

    }
}
