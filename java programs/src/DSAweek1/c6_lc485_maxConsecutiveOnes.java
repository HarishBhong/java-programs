package DSAweek1;

public class c6_lc485_maxConsecutiveOnes {

        public static int findMaxConsecutiveOnes(int[] nums) {

            int count = 0;
            int answer = 0;

            for(int i=0; i<nums.length; i++)
            {
                if(nums[i] == 0)
                {
                    count = 0;
                }
                else
                {
                    count ++;
                }

                if(count > answer)
                {
                    answer = count;
                }
            }
            return answer;
        }

        public static void main(String[] args)
        {
            System.out.println(findMaxConsecutiveOnes(new int[]{1,0,1,1,1,0,1}));
            //new int[] syntax, which is required when passing an array directly as a method argument outside of array declaration.
        }
}
