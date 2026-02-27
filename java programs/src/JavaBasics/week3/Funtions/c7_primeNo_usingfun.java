package JavaBasics.week3.Funtions;
//find the prime numbers between given two numbers

import java.util.Scanner;

public class c7_primeNo_usingfun {

    public static boolean isPrime(int n)
    {
        int count = 0;
        for(int i = 1; i<=n ; i++)
        {
            if(n % i == 0)
            {
                count++;
            }
        }
        return count == 2; // this will return true if(count>2); else false --> simplified form of boolean funtion return.
    }


    public static void printPrime(int start, int end)
    {
        for(int i=start; i<= end; i++)
        {
            if(isPrime(i))
            {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 2 numbers :");
        int start = in.nextInt();
        int end = in.nextInt();

        printPrime(start, end);
    }
}
