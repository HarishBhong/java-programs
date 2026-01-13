package DSAweek5;

public class c3_lowerBound_upperBound {

    // Lower Bound: first element >= target

    public static int lowerBound(int[] arr, int target){
        int start = 0;
        int end = (arr.length)-1;
        int ans = -1;

        while(start <= end)
        {
            int mid = (start+end)/2;
            if(arr[mid] >= target )
            {
                ans = arr[mid];
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
        return ans;
    }

    // Upper Bound: first element > target
    public static int upperBound(int[] arr, int target){
        int start = 0;
        int end = (arr.length)-1;
        int ans = -1;
        while(start <= end)
        {
            int mid = (start+end)/2;

            if(arr[mid] > target)
            {
                ans = arr[mid];
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }

        }
        return ans;
    }

    public static void main(String[] args)
    {
        int[] arr = {2, 4, 6, 8, 10, 12};

        System.out.println("lower bound of 6 :" + lowerBound(arr,6));
        System.out.println("upper bound of 6 :" + upperBound(arr,6));

    }

}
