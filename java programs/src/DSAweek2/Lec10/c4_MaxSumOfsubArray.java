package DSAweek2.Lec10;
/*
Given an array of integers Arr of size N and a number K. return the maximum sum of a subArray of size K.
NOTE: A subarray is a contiguous part of any given array.
eg.1:
input : N = 4, K = 2
arr = [100,400,300,200]
output : 700
explanation: arr[0]+arr[1] = 500, arr[1]+arr[2] = 700, arr[2]+arr[3] = 500
thus, max sum of subarrays where k=2 is 700

 */

// here k is number of elements in subArray window
import java.util.*;
class Solutionc4{
    public int maximumSumSubarray(int[] arr, int k) {
        int n = arr.length;
        int maxSum;
        int currentSum = 0;

        //sum of first k elements
        int i = 0;
        while(n<k) {
            currentSum = currentSum + arr[i];
            i++;
        }
        maxSum = currentSum;

        //slide window
        for (i = k; i < n; i++)
        {
            currentSum = currentSum + arr[i];   //adding new next element to window and taking its sum
            currentSum = currentSum - arr[i-k]; //removing leftmost element of previous window

            if(currentSum > maxSum)
            {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

}
public class c4_MaxSumOfsubArray {

    public static void main(String[] args)
    {
        int[] arr = {100,800,300,400};

        Solutionc4 obj = new Solutionc4(); //maximumSumSubarray() is non-static method :- So it can be accessed through 'object' only, Otherwise we get error
        System.out.println(obj.maximumSumSubarray(arr,2));
    }

}
