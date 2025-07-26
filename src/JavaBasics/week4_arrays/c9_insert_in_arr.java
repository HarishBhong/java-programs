package JavaBasics.week4_arrays;

// insert element in array at given index. without deleting any element from array

// NOTE: this requires shifting of elements and increasing size of array
//       BUT we know size of array is fix. .'. we need to create new array of size +1
//


import java.util.Scanner;
public class c9_insert_in_arr {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = in.nextInt();
        }

        System.out.println("enter new element and position of its insertion:");
        int value = in.nextInt();
        int position = in.nextInt();

        int[] newArr = new int[n+1];
        int i =0;
        int j =0;

        //note 'i' iterates in newArray and 'j' iterates in old array
        while(i < n+1)
        {
            if(i == position - 1) // to print value at (position-1) index in newArray
            {
                newArr[i] = value;
            }
            else{
                newArr[i] = arr[j]; // here if index is other than, new values index. then print as it is in newArray
                j++;                // NOTE: here we increment j only when. element from old array is copied in new array
            }

            i++;
        }

        for( i=0; i<n+1; i++)
        {
            System.out.print(newArr[i] + " ");
        }
    }}
