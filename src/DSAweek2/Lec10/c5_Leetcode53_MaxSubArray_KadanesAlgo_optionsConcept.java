package DSAweek2.Lec10;
/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

 */

class Solutionc5 {
    public int maxSubArray(int[] nums) {
        int n = nums.length;

        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i=1; i<n ; i++)
        {
            int option1 = nums[i]; // 1-hold current element only
            int option2 = nums[i] + currentSum; // 2-holds currentEle + currentMaxSum till now

            currentSum = Math.max(option1, option2);

            if(currentSum > maxSum)
            {
                maxSum  = currentSum;
            }
        }

        return maxSum;
    }
}
public class c5_Leetcode53_MaxSubArray_KadanesAlgo_optionsConcept {
        public static void main(String[] args)
        {
            int[] arr = {3,4,5,-1,6};

            Solutionc5 obj = new Solutionc5();

            System.out.println(obj.maxSubArray(arr));
        }
}
