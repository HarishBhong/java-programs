package JavaBasics.week4_arrays;

import java.util.Scanner;
public class c2_array_basics {
    public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("enter n :");
            int n = in.nextInt();

        int[] arr = new int[n];
        /*  if n = 5 => size of arr = 5
          arr will be initialized as =>  0 0 0 0 0
         */
        for(int i=0; i<n; i++)
        {
            arr[i] = in.nextInt(); //this will take n number of inputs for storing in array
        }

        //printing elements from array
        for(int i =0; i<=n ; i++)
        {
            System.out.println(arr[i]); //this will print all elements from index 1 to n from arr[]
        }
    }
}
