package DSAweek2.Lec12_mathForCoding;
import java.util.*;

public class a1_sieveOfEratosthenes {

    // Method for : Finding if the number is prime
    public static boolean isPrime(int n)
    {
        if(n <= 1)
        {
            return false;
        }

        for(int i = 2; i <= (int)Math.sqrt(n); i++)   // TC O(sqrt(n))
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();

        for(int i = 2; i <= n; i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
    }
}