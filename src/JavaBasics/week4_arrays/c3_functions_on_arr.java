package JavaBasics.week4_arrays;
public class c3_functions_on_arr {
// passing array to method --> is always pass by reference



    public static void func(int a, int[] b) //here we are passing b as array, so [] is must. thats the syntax.
    {
        a = a+5;

        System.out.println(a +" --this is value of 'a' inside method");
        b[0] = b[0] + 5;
        b[2] = b[2] + 5;

    }

    public static void main(String[] args)
    {
        int[] b = {1,2,3,4};
        int a = 5;
        System.out.println(a +" --this is original value of 'a' before func call");
        func(a,b); //here while calling func, we pass arguments. NOTE: syntax for array passing is just arrayName. [] is not used here in argument
                    //but [] symbol is used in declaring array as parameters for a method

        System.out.println(a +" --this is value of 'a' after func execution");
        //as norman var is passed by value: original value of int 'a' will remain unchanged ie.5

        System.out.println();


        //while array is passed by reference: the original array will get modified as per function
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
    }
}
