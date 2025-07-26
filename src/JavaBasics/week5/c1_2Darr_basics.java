package JavaBasics.week5;
/*
eg chess board game needs 2D array for representation

syntax:
1 D --> datatype[] arrName = new datatype[size];
2 D --> datatype[][] arrName = new datatype[rowSize][columnSize];

 ********** MEMORY ALLOCATION *********
 array name(Variable) is stored in the Stack
 array elements are stored in the Heap memory

 */

import java.util.Scanner;
public class c1_2Darr_basics {
    public static void main(String []args){

        int[][] arr = new int[3][3];

        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[2][1] = 8;


        for(int i=0; i<3 ;i++) //row
        {
            for (int j = 0; j < 3; j++){ // column
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //to print the array in column wise order
        // 0,0  1,0  2,0  0,1  1,1  2,1  0,2  1,2  2,2
        System.out.println("column wise:");
        for(int i=0; i < 3; i++) //column
        {
            for (int j = 0; j < 3; j++){ // row
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
