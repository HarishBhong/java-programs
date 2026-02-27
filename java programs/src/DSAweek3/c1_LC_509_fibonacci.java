package DSAweek3;
// fibonacci series --> 0     1      1      2      3     5      8
// fibonacci number -->f(0) fib(1) fib(2) fib(3) fib(4) fib(5) fib(6)
// fib(n) = fib(n-1) + fib(n-2)

//using recursion for fibonacci is not good --> TC = O(n^2)
//using forLoop iteration OR DP is good approach --> TC = O(n)

public class c1_LC_509_fibonacci {

    static int fib(int n){

        if(n == 0){ return 0; }
        if(n == 1){ return 1; }

        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args)
    {
        System.out.println(fib(4));
    }
}
