package DSAweek1;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.

Example:
Input: nums = [3,2,3]
Output: 3
*/

public class c5_leetcode169_majorityElement {

    // Boyer-Moore Voting Algorithm
    static class Solution {
        public int majorityElement(int[] nums) {
            int vote = 0;
            int candidate = -1;

            for (int i = 0; i < nums.length; i++) {
                if (vote == 0) {
                    candidate = nums[i];
                    vote = 1;
                } else {
                    if (nums[i] == candidate) {
                        vote++;
                    } else {
                        vote--;
                    }
                }
            }

            return candidate;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {2, 1, 2, 1, 1, 2};
        System.out.println(s.majorityElement(arr));  // Output: 2
    }
}
