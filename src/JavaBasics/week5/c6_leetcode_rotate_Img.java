package JavaBasics.week5;
/*

rotate matrix by 90 degree clock wise

1  2  3         7  4  1
4  5  6   -->   8  5  2
7  8  9         9  6  3

for this step 1) row converted to column --> Transpose matrix
         step 2) reverse the rows of Transpose matrix
 */


import java.util.Scanner;

public class c6_leetcode_rotate_Img {

    public static void main(String[] args) {
        int n = 4;
        int [][]arr = new int[n][n];

        Scanner in = new Scanner(System.in);

        //get 1 to 16 elements
        int e = 1;
        for(int i = 0; i<=3 ; i++){
            for(int j = 0; j<= 3; j++){
                arr[i][j] = e;
                e++;
            }
        }
        //print matrix
        for(int i = 0; i<=3 ; i++){
            for(int j = 0; j<= 3; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

        //transpose we have to interchange [i][j] --> [j][i]
        // to interchange is to swap numbers
        // '.' we need swapping logic using temporary var

        //int [][]trans = new int[4][4]; -->(without swapping) easy method is to take another matrix and update it as trans[i][j] = arr[j][i]
        int temp;
        for(int i = 0; i < 4; i++ ) {
            for(int j = 0; j<4; j++){
                if( i == j){
                    arr[i][j] = arr[i][j];
                }
                else if(i<j){
                    temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        //print transpose
        System.out.println("transpose");
        for(int i = 0; i<=3 ; i++){
            for(int j = 0; j<= 3; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

        temp = 0;
        //reverse the rows to get 90' rotation
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr[i].length - 1;

            // Swap elements in the row
            while (start < end) {
                temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;

                start++;
                end--;
            }
        }

        System.out.println("row elements of transpose reversed to get 90' rotation: ");
        for(int i = 0; i< arr.length ; i++){
            for(int j = 0; j< arr.length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
