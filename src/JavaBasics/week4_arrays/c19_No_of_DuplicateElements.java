package JavaBasics.week4_arrays;

/*
Find the total no of duplicate elements
eg: 1 2 3 4 2 1 1 1 3 3 4

  here are: 3 duplicates of 1
          : 1 duplicate of 2
          : 2 duplicates of 3
          : 2 duplicates of 4
          ie. total duplicates = 8

 */

//frequency array  method is used here
//this method is only for +ve integers
//for -ve as well as +ve integers Hash map can be used


import java.util.Scanner;
public class c19_No_of_DuplicateElements {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter size:");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("enter "+ n +" values: ");

        for(int i = 0; i<n; i++ ){
            arr[i] = in.nextInt();
        }

        //logic starts

        int maxNum = 0;
        //use builtin function Math.max() for geting maxNum from array
        for(int i = 0; i< n; i++)
        {
            maxNum = Math.max(maxNum, arr[i]);
        }// gives maxNum from arr[]

        int fre[] = new int[maxNum + 1];

        //arr  --> 1 2 1 5 2 2 2
        //index ->0 1 2 3 4 5 6

        //fre  -->0 2 3 0 0 1
        //index ->0 1 2 3 4 5

        for(int i = 0; i< n; i++){
            fre[arr[i]]++;
        }

        int count = 0;
        for(int i = 0; i< maxNum + 1; i++){
            if(fre[i] >= 2){
                count++;
            }
        }

        System.out.println(count);

    }}
