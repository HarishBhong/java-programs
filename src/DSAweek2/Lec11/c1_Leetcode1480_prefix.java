package DSAweek2.Lec11;
//Brute Force soln: O(n) space O(n) - uses extra array

// class Solutionc1 {
//     public int[] runningSum(int[] nums) {
//         int n = nums.length;

//         int[] prefix = new int[n];
//         int sum = 0;
//         int i = 0;
//         while(i<n)
//         {
//             sum = sum + nums[i];
//             prefix[i] = sum;
//             i++;
//         }
//         return prefix;
//     }
// }

//Prefix Sum (cumulative sum) : O(n) : But less space , as No extra array
class Solutionc1 {
    public int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
public class c1_Leetcode1480_prefix {
    public static void main(String[] args)
    {

    }
}
