package JavaBasics.week5;

/*
transpose of the matrix n-th row becomes n-th colum...

1  2  3         1  4  7
4  5  6   -->   2  5  8
7  8  9         3  6  9

2(0,1)  interchange with 4(1,0)
3(0,2) interchange with 7(2,0)
6(1,2) interchange with 8(2,1)

 */
import java.util.Scanner;
public class c5_transpose {
    public static void main(String []args){
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


    }
}
