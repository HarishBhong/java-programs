package DSAweek2.Lec11;
// there is Trick for this type of question:

//for cyclic rotation
// Trick - fist reverse the entire array
//       - now reverse first k elements and elements after k-th element

class Solutionc4 {

    public void reverse(int nums[], int start, int end)
    {
        while(start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n; //after each cycle the rotation is same and repeated

        //reverse entire array
        reverse(nums, 0, n-1);
        //now reverse first k elements
        reverse(nums, 0, k-1);

        //now reverse last n-k elements
        reverse(nums, k, n-1);
    }
}
public class c4_Leetcode189_RotateArray {
}
