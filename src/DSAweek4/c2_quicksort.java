package DSAweek4;
import java.util.*;

public class c2_quicksort {


    public static int partition(int start, int end, int a[])
    {
        int pivot = a[end];
        int i = start;

        for(int j=start; j<=(end-1); j++){
            if(a[j] < pivot)
            {
                //swap
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
        }

        int temp = a[i];
        a[i] = a[end];
        a[end] = temp;

        return i;
    }

    public static void quickSort(int start, int end, int a[]){

        //base case
        if(start >= end)
        {
            return;
        }

        int k = partition(start, end, a);

        quickSort(start, k-1, a);
        quickSort(k+1, end, a);

    }

    public static void main(String[] args){

        int a[] = {5, 4, 1, 2, 3};

        int n = a.length;
        quickSort(0,n-1,a);

        for(int i=0;i<n;i++){
            System.out.println(a[i] + " ");
        }
    }
}
