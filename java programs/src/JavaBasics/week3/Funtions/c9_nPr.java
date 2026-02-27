package JavaBasics.week3.Funtions;

// find nPr

// nPr = n! / (n-r)!
import java.util.Scanner;
public class c9_nPr {

    public static long fact(int n)
    {
        long fact = 1;
        for(int i=1; i<=n ; i++)
        {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n :");
        int n = in.nextInt();
        System.out.println("enter r :");
        int r = in.nextInt();

        long n_fact = fact(n);
        long nr_fact = fact(n-r);

        long answer = n_fact/nr_fact;

        System.out.println(answer);
    }
}
