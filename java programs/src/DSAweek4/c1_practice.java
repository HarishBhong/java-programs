package DSAweek4;

import java.util.*;
public class c1_practice {

    //recursive divide function
    public static void mergeDivideLogic(int start, int end, int[] a )
    {

        //base case
        if(start == end)
        {
            return;
        }

        int mid = (start+end)/2;

        mergeDivideLogic(start, mid, a);

        mergeDivideLogic(mid+1, end, a);
        
    }

    public static void main(String[] args)
    {
     int[] a = {5,4,3,2,1};

     int n = a.length;
     mergeDivideLogic(0, n-1, a);
    }
}
