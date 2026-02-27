package JavaBasics.week4_arrays;

// array = {1, 2, 3}
// subArrays = {1}, {2}, {3}, {1,2}, {2,3}, {1,2,3}
// subArray must always be consecutive elements

import java.util.Scanner;

//NOTE: {1,3} is not a subArray
public class c10_printAll_subArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter size of array:");
        int n = in.nextInt();

        int[] nums = new int[n];
        System.out.println("enter "+ n + " elements:");
        for(int i=0; i<n; i++)
        {
            nums[i] = in.nextInt();
        }

        // Logic: using fixed point concept

        // first loop fixes from 0, 1, 2 ...
        for(int i=0; i<n; i++) //  i --> fixed point
        {
            // second loop makes first loop run uptill end point
            for(int j = i; j<n; j++ ) // j --> ending point
            {
                //subArray i --> j
                for(int k=i; k<=j; k++)
                {
                    System.out.print(nums[k] + " ");
                }
                System.out.println(" ");

            }
        }
    }
}

/*
NOTE : i runs from 0 to n
     : j runs from i to n
     : k runs from i to j

     and we are printing for all values of k

     let n = 3

for i = 0 --> j = 0 --> k = 0
              j = 1 --> k = 0, 1
              j = 2 --> k = 0, 1, 2
              j = 3 --> k = 0, 1, 2, 3

for i = 1 --> j = 1 --> k = 1
              j = 2 --> k = 1, 2
              j = 3 --> k = 1, 2, 3

for i = 2 --> j = 2 --> k = 2
              j = 3 --> k = 2, 3

for i = 3 --> j = 3 --> k = 3

STOP

 */