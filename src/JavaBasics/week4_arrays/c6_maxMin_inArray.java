package JavaBasics.week4_arrays;

// find maximum and minimum element of array

import java.util.Scanner;
public class c6_maxMin_inArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter size of array:");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("enter "+ n + " elements:");
        for(int i=0; i<n; i++)
        {
            arr[i] = in.nextInt();
        }

        int max = arr[0];
        for(int i = 1; i<n; i++)
        {
            if( arr[i]>max){
                max = arr[i];
            }
        }

        int min = arr[0];
        for(int i = 1; i<n; i++)
        {
            if( arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("max is "+max);
        System.out.println("min is "+min);
    }
}
