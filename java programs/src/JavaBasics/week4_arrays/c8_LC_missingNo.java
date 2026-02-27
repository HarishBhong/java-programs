package JavaBasics.week4_arrays;

/*leetCode:
Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.

 ie. its an array of integers from 0 - n. but any one integer is missing in the array
 eg. array 0 to 4 : 0, 1, 3, 4 :- here size of array is also 4 as it starts from 0
                              :- 2 is missing from array
                              */

import java.util.Scanner;

public class c8_LC_missingNo {

    public static int missingNumber(int[] nums) {

        //given size of array = n
        //OR use length to get size
        int n = nums.length;

        //sum from 0 to n
        int x = (n * (n + 1))/2 ;

        //sum of elements present in array
        int y = 0;
        for(int i =0; i<n; i++)
        {
            y = y + nums[i];
        }
        return x-y;
    }

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

        System.out.println(missingNumber(nums)+" is missing");

    }
}
