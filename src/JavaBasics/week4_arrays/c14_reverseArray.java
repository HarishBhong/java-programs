package JavaBasics.week4_arrays;
// reverse an array

import java.util.Scanner;
public class c14_reverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size:");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("enter "+ n +" values: ");

        for(int i = 0; i<n; i++ ){
            arr[i] = in.nextInt();
        }

        int i = 0;   //start
        int j = n-1; //last index

        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.println("reversed array:");
        for(i=0; i<n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
