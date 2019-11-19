import java.util.Collections;
import java.util.Arrays;
public class CitiesSort
{
    public static void main(String[] args)
    {
        String[] cities = {"brampton", "mississauga", "toronto", "montreal"};
        Arrays.sort(cities);
        System.out.println("Ascending order: ");
        for (String s:cities){
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Ascending order: ");
        Arrays.sort(cities, Collections.reverseOrder());
        for (String s:cities){
            System.out.println(s);
        }
    }
}
