package DSAweek3;
//self
//find sum of all natural numbers from 1 to n

public class c3_sumOfn {

    static long sumOF(int n)
    {
        if( n == 1){
            return 1;
        }
        return n + sumOF(n-1);
    }

    public static void main(String[] args)
    {
        System.out.println(sumOF(4));
    }
}
