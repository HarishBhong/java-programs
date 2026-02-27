package DSAweek2.Lec10;

public class c2_Leetcode80_removeDuplicateVariation {
}


class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;

        int i = 0;
        int j = 0;
        int index = 0;

        while(i < n )
        {
            int freq = 0;
            while( j< n && nums[i] == nums[j])
            {
                j++;
                freq++;
            }

            if(freq == 1)
            {
                nums[index] = nums[i];
                index++;
            }
            else
            {
                nums[index] = nums[i];
                index++;

                nums[index] = nums[i];
                index++;
            }
            i = j;
        }
        return index;

    }
}