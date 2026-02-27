package DSAweek2.Lec11;
/*
consider an array A[] of integers and following two types of queries.
1.update(l,r,x) : adds x to all vales A[l] to A[r] (both inclusive)
2.printArray() : Prints the current array.

ex.
input: A[] {10,5,20,40}
        update(0, 1, 10)
        printArray()
        update(1, 3, 20)
        update(2, 2, 30)
        printArray()
output: 20 15 20 40
        20 35 70 60
explanation:
the query update(0, 1, 10)
adds 10 to A[0] and A[1] After update
A[] becomes {20 15 20 40}

query update(1, 3, 20)
adds 20 to A[1] to A[3] After update
A[] becomes {20 35 40 60}

query update(2, 2, 30)
adds 30 to A[2] to A[2]
A[] becomes {20 35 70 60}
 */

import java.util.*;

//public class c2 {
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter size of array");
//        int n = in.nextInt();
//
//        int[] arr = new int[n];
//        System.out.print("enter array elements:");
//        for(int i=0; i<n; i++)
//            arr[i] = in.nextInt();
//
//        //prepare diff array of n+1 size
//        int diff[] = new int[n+1];
//
//        System.out.print("enter number queries:");
//        int q = in.nextInt();
//         //update according to query
//        for(int i=0; i<q; i++)
//        {
//            int l = in.nextInt();
//            int r = in.nextInt();
//            int val = in.nextInt();
//
//            diff[l] = diff[l] + val;
//            diff[r+1] = diff[r+1] - val;
//
//        }
//
//        int sum = 0;
//        for(int i=0; i<n; i++){
//            sum = sum + diff[i];
//            System.out.print(sum+ arr[i] + " ");
//        }
//
//    }
//}

public class c2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("enter size of array");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.print("enter array elements:");
        for(int i=0; i<n; i++)
            arr[i] = in.nextInt();

        // prepare diff array
        int diff[] = new int[n+1];

        System.out.print("enter number queries:");
        int q = in.nextInt();

        // updates
        for(int i=0; i<q; i++)
        {
            int l = in.nextInt();
            int r = in.nextInt();
            int val = in.nextInt();

            diff[l] += val;
            diff[r+1] -= val;
        }

        // ---------- PREFIX ARRAY ----------
        int prefix[] = new int[n];
        prefix[0] = diff[0];

        for(int i=1; i<n; i++)
            prefix[i] = prefix[i-1] + diff[i];

        // ---------- FINAL ANSWER ARRAY ----------
        int ans[] = new int[n];

        for(int i=0; i<n; i++)
            ans[i] = arr[i] + prefix[i];

        // ---------- PRINT ----------
        System.out.println("\nDiff array:");
        for(int i=0;i<=n;i++)
            System.out.print(diff[i]+" ");

        System.out.println("\nPrefix array:");
        for(int i=0;i<n;i++)
            System.out.print(prefix[i]+" ");

        System.out.println("\nFinal updated array:");
        for(int i=0;i<n;i++)
            System.out.print(ans[i]+" ");
    }
}