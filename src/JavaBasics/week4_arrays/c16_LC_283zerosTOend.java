package JavaBasics.week4_arrays;
/*  move all the zeros present in array to the end of array. maintaining other relative order of non-zero elements
    note that this to be done without creating copy of the array
    eg: arr = [1, 0, 2, 0, 3, 4, 0]
    O/P arr = [1, 2, 3, 4, 0, 0, 0]
 */
public class c16_LC_283zerosTOend {

    public static void main(String[] args) {

        int[] nums = new int[]{0,0,2,0,0,4,3,0};

        int n = nums.length;

        int i = 0;
        int j = 0;

        //step 1: move +ve elements at the start
        while(j < n)
        {
            if(nums[j] != 0)
            {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        //step 2: move zero's at the end
        //actually writing rest all elements as zeros
        while(i < n){
            nums[i] = 0;
            i++;
        }

        for( i = 0; i < n; i++)
        {
            System.out.print(nums[i]+ " ");
        }
    }
}
