//package DSAweek2.Lec10;
/*
// NOTE: here we its given immutable array - so we can use this prefix array concept
Prefix array :- new array that has some precalculated values to that are stored for future use
eg. here we need to calculate sum of all the elements from an array from index 'x' to index 'y'

  arr[] = [1,4,8,3,4]
  prefix[] = [1,5,13,16,20]
  calculate sum of elements arr[1] to arr[3]
  ie: arr[1]+arr[2]+arr[3] = 4+8+3 = 15  -> code will involve loops to iterate and more TC
  OR prefix[4] - prefix[0] = 16-1 = 15 -> code will be precalculated and easy with less TC

  we have to design/code prefix array such that prefix[i] = arr[0] + arr[1] + arr[...] + arr[i]
  //precomputation
        int sum = 0;
        for(int i = 0; i<n; i++)
        {
            sum = sum + nums[i];
            prefix[i] = sum;
        }

 */
//public class c3_Leetcode303_prefixMethod {
//}
//
//class NumArray {
//    int prefix[];
//   this array stores sum of elements till that index
//   eg: nums = 10,2,30,5
//   prefix   = 10,12,42,47
//    public NumArray(int[] nums) {
//        int n = nums.length;
//        prefix = new int[n];
//
//        //precomputation
//        int sum = 0;
//        for(int i = 0; i<n; i++)
//        {
//            sum = sum + nums[i];
//            prefix[i] = sum;
//        }
//    }
//
//    public int sumRange(int left, int right) {
//
//        if(left == 0)
//        {
//            return prefix[right];
//        }
//        else
//        {
//            return prefix[right] - prefix[(left-1)];
//        }
//    }
//
//}
//
//
//  Your NumArray object will be instantiated and called as such:
//  NumArray obj = new NumArray(nums);
//  int param_1 = obj.sumRange(left,right);
//