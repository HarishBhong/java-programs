package DSAweek2.Lec10;
/*
two pointer approach
- used to iterate
- fix one reference pointer "i" and move (iterate) using other reference pointer "j"

- there can be multiple variations of two pointer

iterating through array is mostly done using array -> But its brute force approach

notice that =>
brute force two pointer : for(i -> 0 to n)
                              for(j -> 0 to n for each i)

                         -> this takes O(n*n) time complexity

BUT some other variations pof Two Pointer -> take only O(n) time complexity
 */

//NOTE:
// This two pointer takes -> O(n) time complexity
public class c1_Leetcode26_twoPointer {
}
//
//class Solution {
//    public int removeDuplicates(int[] nums) {
//        int n = nums.length;
//
//        int i = 0;
//        int j = 0;
//        int index = 0;
//
//        while(i < n)
//        {
//            //find next unique element , this moves forwards untill new element is found
//            while( j<n && nums[i] == nums[j] )
//            {
//                j++;
//            }
//
//            nums[index] = nums[i];
//            index++;
//
//            i = j;
//        }
//        return index;
//    }
//}
