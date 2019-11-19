import java.util.Scanner;
public class ArrayMinMaxCopy
{
    public static void main(String[] args)
    {
        int org_arr[] = new int[5];
        int dest_arr[] = new int[org_arr.length];
        Scanner input = new Scanner(System.in);
        System.out.println("enter 5 number");
        for(int i = 0; i < org_arr.length; i++){
            org_arr[i] = input.nextInt();
        }
//        copying in 1st way
        for(int i = 0; i < dest_arr.length; i++){
            dest_arr[i] = org_arr[i];
        }
//        coping in 2nd way
//        System.arraycopy(org_arr, 0,dest_arr,
//            0,org_arr.length);

        for(int i = 0; i < org_arr.length; i++){
            System.out.println(org_arr[i]);
        }
        System.out.println("copy: ");
        for(int i = 0; i < dest_arr.length; i++){
            System.out.println(dest_arr[i]);
        }
        int min = org_arr[0];
        int max = org_arr[0];

        for(int i = 1; i < org_arr.length; i++){
            if(min > org_arr[i])
                min = org_arr[i];
            if(max < org_arr[i])
                max = org_arr[i];
        }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
    }
}