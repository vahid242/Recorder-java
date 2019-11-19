public class PrimeNumber
{
    public static void main(String[] args)
    {
        boolean isPrime = true;
        for(int num=2; num < 101; num++){
            isPrime=true;
            for(int i=2; i < num/2; i++){
                if(num % i == 0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(num + " ");
            }
        }
//        int num =6;
//        boolean isPrime = true;
//        for(int i=2; i<=num /2; i++){
//            if(num % i == 0){
//                isPrime=false;
//                break;
//            }
//        }
//        if(isPrime)
//        {
//            System.out.println("is prime");
//        }
//        else
//        {
//            System.out.println("is not prime");
//        }
    }
}
