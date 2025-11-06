package DSAweek3;


// 5! = 5*4*3*2*1
// n! = n * (n-1) * (n-2) * (n-3) ....* 1
// 5! = 5 * 4! --> ie. fact(5) = 5 * fact(4) --> this is recursion -> when large problem can be solved using breaking it into small problem
/*

step 1:Return type --> as we will be storing factoial--> type will be 'long'
            means some function with 'long' type:
step 2: Parameter -->
            long  funct(int n){      initially we think 1 int parameter, later we'll see some other thing

            }

step 3: Recursive case -->

step 4: then think of base case --> base case is always before recursive case in the code but while building logic we think it after

step 5: what to return from recursive case --> here returning n * fact(n-1) --> this must be very clear --> why we are not doing return (n-1) <-- this must be very clear why we are not doing this

 */
public class c2_factorial_Using_recursion {

    //as its big value, factorial can be stored in 'long' instead of 'int'
    static long funct(int n){

        if(n == 1 || n == 0){
            return 1;
        }
        //recursive call
        return n * funct(n-1);

    }

    public static void main(String[] args)
    {
        System.out.println(funct(5));
    }
}
