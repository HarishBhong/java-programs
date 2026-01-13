package DSAweek4;

import java.util.*;
public class c1_1_mergeSortSimplified {

    // merge function: actual sorting and merging happens here
    public static void merge(int start, int mid, int end, int[] a)
    {
        System.out.println("\n--- Merging ---");
        System.out.println("Left part indices: " + start + " to " + mid);
        System.out.println("Right part indices: " + (mid+1) + " to " + end);

        System.out.print("Left array: ");
        for (int i = start; i <= mid; i++) System.out.print(a[i] + " ");
        System.out.println();

        System.out.print("Right array: ");
        for (int j = mid+1; j <= end; j++) System.out.print(a[j] + " ");
        System.out.println();

        ArrayList<Integer> temp = new ArrayList<>();
        int i = start;
        int j = mid + 1;

        // merging process
        while (i <= mid && j <= end) {
            if (a[i] < a[j]) {
                temp.add(a[i]);
                System.out.println("Added " + a[i] + " from left side");
                i++;
            } else {
                temp.add(a[j]);
                System.out.println("Added " + a[j] + " from right side");
                j++;
            }
        }

        // copy remaining elements
        while (i <= mid) {
            temp.add(a[i]);
            System.out.println("Added remaining " + a[i] + " from left side");
            i++;
        }
        while (j <= end) {
            temp.add(a[j]);
            System.out.println("Added remaining " + a[j] + " from right side");
            j++;
        }

        // copying sorted temp list back into original array
        int k = start;
        for (int z = 0; z < temp.size(); z++) {
            a[k] = temp.get(z);
            System.out.println("Placed " + temp.get(z) + " at index " + k);
            k++;
        }

        System.out.print("Array after merging indices [" + start + "..." + end + "]: ");
        for (int m = start; m <= end; m++) System.out.print(a[m] + " ");
        System.out.println("\n-----------------\n");
    }

    // recursive divide function
    public static void mergeSortDivide(int start, int end, int[] a)
    {
        System.out.println("Dividing from index start = " + start + " to end = " + end);

        // base case
        if (start == end) {
            System.out.println("Base case reached at index " + start + " (element: " + a[start] + ")");
            return;
        }

        int mid = (start + end) / 2;
        System.out.println("Current mid = " + mid);

        // sort left half
        mergeSortDivide(start, mid, a);

        // sort right half
        mergeSortDivide(mid + 1, end, a);

        // merge both halves
        merge(start, mid, end, a);
    }

    public static void main(String[] args)
    {
        int a[] = {5, 4, 3, 2, 1};

        System.out.println("Initial array:");
        for (int i = 0; i < a.length; i++) System.out.print(a[i] + " ");
        System.out.println("\n");

        mergeSortDivide(0, a.length - 1, a);

        System.out.println("Final sorted array:");
        for (int i = 0; i < a.length; i++) System.out.print(a[i] + " ");
        System.out.println();
    }

}
