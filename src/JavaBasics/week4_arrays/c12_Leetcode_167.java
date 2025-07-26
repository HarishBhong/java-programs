package JavaBasics.week4_arrays;

// find two indexes in sorted array whose sum is equal to the target element
/*
eg: if arr={2, 5, 7, 9} target = 7
    O/P = [0,1]
 */
import java.util.Arrays;

import java.util.Scanner;
public class c12_Leetcode_167 {

    public static int[] twoSum(int[] numbers, int target) {

        // returns an array having two indices as answers
        int[] result = new int[2];

        int n = numbers.length; //find length of the array
        int i = 0;   //pointing first index of array
        int j = n-1; //pointing last index of array

        while(i < j)
        {
            int currentSum = numbers[i] + numbers[j];

            if(currentSum == target)
            {
                result[0] = i;
                result[1] = j;
                return result; // return indices in array, immediately when match is found
            }

            else if(currentSum > target)
            {
                j--;
            }
            else{
                i++;
            }
        }
        // If no pair is found, return [-1, -1]
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        //taking input ---------------------------------------------------------------------------------
        Scanner in = new Scanner(System.in);
        System.out.println("enter size:");
        int n = in.nextInt();

        int[] numbers = new int[n];
        System.out.println("enter " + n + " values: ");
        int i = 0;
        while (i < n) {
            numbers[i] = in.nextInt();
            i++;
        }

        System.out.println("enter target sum: ");
        int target = in.nextInt();

        //main logic-------------------------------------------------------------------------------------
        int[] answer = twoSum(numbers, target);

        if (answer[0] == -1) {
            System.out.println("No pair found with the given target sum.");
        } else {
            System.out.println("Indices of the two elements: " + Arrays.toString(answer));
            System.out.println(" indices of the two elements: "+ answer[0] +" & "+ answer[1]);

            //Arrays.toString(result): This converts the result array into a string format that can be printed easily.
            // It will output the elements of the array in the form [index1, index2]
        }
        in.close();
    }
}