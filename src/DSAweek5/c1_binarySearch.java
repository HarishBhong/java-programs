package DSAweek5;
import java.util.*;

public class c1_binarySearch {

    public static void main(String[] args)
    {
        int[] arr  = {1,2,3,4,5,6};

        int t = 6;

        int start  = 0;
        int end = arr.length - 1;

        int ans = -1;

        while(start <= end)
        {
           int mid = (start + end)/2;

           if(arr[mid] == t)
           {
               ans = mid;
               break;
           }
           else if (t < arr[mid])
           {
               end = mid-1;
           }
           else{
               start = mid+1;
           }
        }
        System.out.print("target element "+t + " is at index: "+ans);

    }
}
