package DSAweek3;
import java.util.*;


public class c8_LC_977_SqOfSortedArray {

    /*
An array is sorted in nondecreasing order if every element is less than or equal to the next one.
This means the values can either stay the same or increase as you move through the array. duplicates are allowed, but the numbers never decrease
*/

    //class Solution {
        public static int[] sortedSquares(int[] nums) {
            int n = nums.length;

            int[] answer = new int[n];

            //pointer to traverse answer array
            int index = n - 1; //pointing last element initially

            //pointers to travrese through nums
            int i = 0;
            int j = n - 1; //last index

            while (i <= j) {
                if (Math.abs(nums[i]) > Math.abs(nums[j])) //absolute needs to be used--> for taking only the magnitude into considertion
                {
                    answer[index] = nums[i] * nums[i];
                    i++;
                } else {
                    answer[index] = nums[j] * nums[j];
                    j--;
                }

                index--;
            }
            return answer;

        }
public static void main(String[] args){
    int[] nums = {-4, -1, 0, 3, 10};  // sample input
    int[] result = sortedSquares(nums);

    System.out.println(Arrays.toString(result));
}
}
