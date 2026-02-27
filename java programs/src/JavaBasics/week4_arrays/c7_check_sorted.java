package JavaBasics.week4_arrays;

import java.util.Scanner;
public class c7_check_sorted {
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

        //first assume array is sorted
        boolean arraySorted = true;

        for(int i=0; i<n-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                arraySorted = false; //is not sorted mark it false and break
                break;
            }
        }
        if(arraySorted)
        {
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }
    }
}
