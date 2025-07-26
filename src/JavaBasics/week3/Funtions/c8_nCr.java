package JavaBasics.week3.Funtions;

//given to ints n and r. Find their nCr

//formula => nCr = n! / r!(n-r)!

import java.util.Scanner;
public class c8_nCr {

    //check if number is factorial
    public static long factorial(long f)
    {
        int fact = 1;
        for(int i = 1; i<= f; i++)
        {
            fact = fact * i;
        }
        return fact;
    }

    public static long nCr(long n, long r)
    {
        long n_fact= factorial(n);
        long r_fact= factorial(r);
        long nr_fact= factorial(n-r);

        long answer = n_fact/r_fact;
        answer = answer / nr_fact;

        // if calculation is done in single step, its getting overflow. So doing 1 step a time is prefered
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n :");
        int n = in.nextInt();
        System.out.println("enter r :");
        int r = in.nextInt();

    System.out.println(nCr( n, r));
    }
}
