package JavaBasics.week5;
/*

diagonal printing of elements
eg: 1  2  3  4
    5  6  7  8
    9  10 11 12
    13 14 15 16

    o/p =>  1
            5 2
            9 6 3
            13 10 7 8
            14 12
            16
 */
import java.util.Scanner;
public class c7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("no of row:");
        int row = in.nextInt();
        System.out.println("no of columns:");
        int col = in.nextInt();

        int[][] matrix = new int[row][col];
        System.out.println("input the elements of matrix:");
        for(int i =0; i<matrix.length; i++)
        {
            for(int j=0; j < matrix[0].length; j++)
            {
                matrix[i][j] = in.nextInt();
            }
        }

        //Logic
        //1 st step -- starting points => all elements in 1st column

        for(int i = 0; i < matrix.length; i++)   //matrix.length = total no of rows
        {
            int R = i;
            int C = 0;

            //logic for traversing diagonally from that starting point
            while(R >= 0 && C < matrix[0].length)
            {
                System.out.print(matrix[R][C] + " ");

                R--; // row decrease R--
                C++; //col increase C++
            }
            System.out.println();
        }

        //above code prints for starting points from 1st column

        //step 2 --> second set of starting elements
        // starting from elements of last row (3,1) (3,2) (3,3)...
        // note: 1st element of last row (ie. 13) is already considered in above step, So we have to leave it NOW
        for(int j = 1; j < matrix.length; j++ )  //matrix[0].length = 4
        {
            int C = j;
            int R = matrix.length-1; //last row ie. 4-1= 3

            //increase Column C++
            //decrease row R--;

            //logic for traversing diagonally from that starting point
            while(R >= 0 && C < matrix[0].length)
            {
                System.out.print( matrix[R][C] + " ");
                R--;
                C++;
            }
            System.out.println();
        }

    }
}
