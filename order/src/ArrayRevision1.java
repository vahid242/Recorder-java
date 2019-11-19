public class ArrayRevision1
{
    public static void main(String[] args) {
//        declare, create, initialize array
//        int[] numbers = {5,8,1,0,2,3};
//        for (int n=0; n< numbers.length ; n++)
//        {
//            System.out.println("element at position " + n +
//                    " is " + numbers[n]);
//        }

//        an array with list of cities
//        print those in uppercase
        String[] cities = {"brampton", "mississauga", "toronto", "montreal"};
//        for (int i=0; i< cities.length ; i++)
//        {
//
//            System.out.println(cities[i].toUpperCase());
//        }
        for (String city : cities)
        {
            System.out.println(city.toUpperCase());
        }

    }
}
