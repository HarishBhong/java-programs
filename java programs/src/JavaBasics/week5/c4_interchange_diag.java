package JavaBasics.week5;

/*
interchange diagonal elements
swapping technique logic:

 1   2   3   4           *4   2   3   *1    --> [0][0] <->  [0][3]
 5   6   7   8    -->    5   *7   *6   8    --> [1][1] <->  [1][2]
 9  10  11  12           9   *11  *10  12   --> [2][1] <->  [2][2]
13  14  15  16          *16   14  15  *13   --> [3][1] <->  [3][3]

here size  n = 4
here the row no [i] is same just the column[j] changes [j] --> [n-j-1]

*/

import java.util.Scanner;
public class c4_interchange_diag {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        //int m = in.nextInt();


        int [][]arr = new int[n][n];

        for(int i = 0; i<n; i++){
            for(int j =0; j<n; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i=0; i<n ;i++) //row
        {
            for (int j = 0; j < n; j++){ // column
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("diagonal interchange:");
        int j = 0;
        for(int i = 0; i<n; i++){
            // swap (arr[i)[j], arr[i][n-j-1])

            int temp = arr[i][j];
            arr[i][j] = arr[i][n-j-1];
            arr[i][n-j-1] = temp;
            j++;
        }

        for(int i = 0; i<n ; i++)
        {
            for(j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
