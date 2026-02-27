package JavaBasics.week4_arrays;

//find the target element and give its index in array
// can be solved using Linear search or Binary Search
//here we are using linear search

import java.util.Scanner;
public class c18_linearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size:");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("enter "+ n +" values: ");

        for(int i = 0; i<n; i++ ){
            arr[i] = in.nextInt();
        }

        System.out.println("enter enter to be searched:");
        int target = in.nextInt();

        int answer = -1; //assuming element is not present
        for(int i = 0; i<n; i++)
        {
            if(arr[i] == target)
            {
                answer = i;
                break; //break as we found the target element. no need to iterate further
            }

        }
        System.out.println(answer);

    }
}
