package DSAweek4;
//here: time complexity - O(n log(n))
// in all cases its same nlogn for merge sort
//this is why Merge sort is best sorting algorithm of all sorting algoritms as it has same TC nlogn for all three cases -> best/worst/avg

//quick sort also has bestcase -> O(nlogn) BUT worstcase -> O(n^2)

import java.util.ArrayList;

// NOTE --> in 1 sec we can perform around 10^8 operations
public class c1_mergesort {

    //step 1.1 --> merge function: Actual Sorting is happening here. IMP part

    public static void merge(int start, int mid, int end, int[] a)
    {
        //note: these are different parameters(start,mid,end) they are NOT having same values as parameters from mergeSortDivide()
        //first half --> (start-mid)
        //second half --> (mid+1 -- end)

        ArrayList<Integer> temp = new ArrayList<>();
        int i = start;
        int j = mid+1;

        while(i <= mid && j<=end )
        {
            if(a[i] < a[j])
            {
                temp.add(a[i]);
                    i++;
            }
            else
            {
                temp.add(a[j]);
                    j++;
            }

        }

        //scenario -- first part elements are remaining
        while(i <= mid)
        {
            temp.add(a[i]);
            i++;
        }
        //scenario -- second part elements are remaining

        while(j <= end)
        {
            temp.add(a[j]);
            j++;
        }

        //Tricky part: (copying temp elements to original array)
        //here we have to place temp elements(index 0 to (temp.size)-1 ) to original array ( start - end) index

        int k = start;
        for(int z=0; z<temp.size(); z++) //i is already declared so using 'z' var
        {
            a[k] = temp.get(z);
            k++;
        }
    }

    //step 1 --> Divide (using recursion)
    public static void mergeSortDivide(int start, int end,int[] a)
    {
        // base case
        if(start == end) //base case is when to stop recursion--> here we want to stop when we have only 1 element left-> for that the logic is (start==end) as we have unique elements in array, (start==end) means only one element
        {
            return;
        }

        //recursive case
        int mid = (start+end)/2;
        mergeSortDivide(start, mid, a); //first sort the left most part of array --> left part is sorted
        mergeSortDivide(mid+1, end, a); //later after left-part is sorted, then sort the right most part of array. --> right part is sorted

        // here after the recursive calls are terminated; WHAT TO DO NEXT?
        merge(start, mid, end, a);

    }

    public static void main(String[] args)
    {
        int a[] = {5,4,3,2,1,7,2,-1,0};

        int n = a.length;
        mergeSortDivide(0, n-1, a);

        for(int i=0; i<n; i++)
        {
            System.out.println(a[i] + " ");
        }
    }
}
