package DSAweek5;
/*
checkout leetcode 34 -
Binary search
Time Complexity: O(logn)

O(log n) is optimal – no better solution exists for sorted arrays (proven by information theory).
Note: The input reading (Scanner) is O(n), but that's input overhead (not part of the algorithm). The core logic is O(log n).
 */

import java.util.*;
public class c2_leetCode34 {


        public static int firstOccurence(int nums[], int target)
        {
            int n = nums.length;
            int start = 0;
            int end = n-1;

            int ans = -1;

            while(start <= end)
            {
                int mid = (start+end)/2;

                if(target == nums[mid])
                {
                    ans = mid;
                    end = mid - 1;
                }
                else if(target < nums[mid])
                {
                    end = mid-1;
                }
                else
                {
                    start = mid + 1;
                }
            }
            return ans;
        }


        public static int lastOccurence(int nums[], int target)
        {
            int n = nums.length;
            int start = 0;
            int end = n-1;

            int ans = -1;

            while(start <= end)
            {
                int mid = (start+end)/2;

                if(target == nums[mid])
                {
                    ans = mid;
                    start = mid + 1;
                }
                else if(target < nums[mid])
                {
                    end = mid-1;
                }
                else
                {
                    start = mid + 1;
                }
            }
            return ans;
        }

        public static int[] searchRange(int[] nums, int target) {

            int fo =  firstOccurence(nums, target);
            int lo =  lastOccurence(nums, target);

            return new int[]{fo,lo}; //the problem statement expects array of 2 integer as answer.

        /*Why Not Just use like this: return fo, lo;  ? --> wrong java return syntax for multiple values
            Java does not allow returning multiple values directly. You must wrap them in an array (or object) to satisfy the int[] return type. */
        }

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("enter size of array: ");
            int n = in.nextInt();

            int[] nums = new int[n];
            System.out.println("enter array elements:");
            for(int i =0; i<n; i++)
            {
                nums[i] = in.nextInt();
            }

            System.out.println("enter target: ");
            int target = in.nextInt();

            int[] result = searchRange(nums, target);
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        }

}



