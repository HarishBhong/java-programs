package JavaBasics.week4_arrays;

//find the smallest and the 2nd smallest element in the array

import java.util.Scanner;
public class c13_smallest_element {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size:");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("enter "+ n +" values: ");
        int i = 0;
        for(i = 0; i<n; i++ ){
            arr[i] = in.nextInt();
        }

        int min = (int)(1e9);
        int smin = (int)(1e9); //second minimum

        i = 0;
        while(i<n)
        {
            if(arr[i] < min) {
                smin = min;
                min = arr[i];
            }

            else if(arr[i] > min && arr[i] < smin)
            {
                smin = arr[i];
            }
            i++;
        }

        System.out.println("min is :"+min);
        System.out.println("second min is :"+smin);

    }

}
