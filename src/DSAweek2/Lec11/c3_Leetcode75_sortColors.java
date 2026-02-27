package DSAweek2.Lec11;

import java.util.*;
//sorting algo will take O(nlogn)
//using two pointer we can solve in O(n) {O(n) is better than O(nlogn)}
class Solutionc3 {
    public void sortColors(int[] nums) {

        int n = nums.length;
        int zeros = 0;
        int ones = 0;

//count number of zero's, one's, two's
        for(int i=0; i<n; i++)
        {
            if(nums[i] == 0)
            {
                zeros++;
            }
            else if(nums[i] == 1)
            {
                ones++;
            }
        }

        int twos = n - (zeros + ones); //no of tow's

        int i = 0;
        while(i < zeros)
        {
            nums[i] = 0;
            i++;
        }

        while(i < (zeros + ones))
        {
            nums[i] = 1;
            i++;
        }
        while(i < n)
        {
            nums[i] = 2;
            i++;
        }

    }
}

public class c3_Leetcode75_sortColors {
}

