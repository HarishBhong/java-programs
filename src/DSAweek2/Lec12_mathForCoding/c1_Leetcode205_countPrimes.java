package DSAweek2.Lec12_mathForCoding;

//soln using 'Sieve of eratothenes'
class Solutionc1 {
    final int N = 5000000;
    public int countPrimes(int n) {

        boolean isPrime[] = new boolean[N];
        //Arrays.fill(isPrime,true); //make all elements true
        // Note --> initially default of boolean is FALSE

        for(int i=2; i<n; i++)
        {
            isPrime[i] = true;  //mark all no's upto 'n' as Prime .
            // firstly we are assuming all no's upto n as PRIME
        }

        //now we start assigning False to the values that are not prime
        isPrime[0] = false; //--> 0 is not prime
        isPrime[1] = false; //--> 1 is neither Prime nor Composite

        for(long i = 2; i<n; i++)
        {
            if(isPrime[(int)i] == true)
            {
                for(long j = i*i ; j<n; j=j+i)
                {
                    isPrime[(int)j] = false; // these are multiples of i, Hence Not Primes
                }
            }
        }

        //now lets count how many values are marked as 'True' ie. they are primes
        int count = 0;
        for(int i=0; i<n; i++)
        {
            if(isPrime[i] == true)
            {
                count++ ;
            }
        }

        return count;

    }
}
public class c1_Leetcode205_countPrimes {
}
