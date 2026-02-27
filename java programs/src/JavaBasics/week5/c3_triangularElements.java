package JavaBasics.week5;

/*
upper triangular elements (above diag) --> where i <= j      00 01 02 03
lower triangular elements (below diag) --> where i >= j      10 11 12 12
                                                             20 21 22 23
                                                             30 31 32 33
 */
import java.util.Scanner;
public class c3_triangularElements {
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

       // UpperTriangular ele

        for(int i = 0; i<n; i++){
            for(int j =0; j<n; j++){

                if( i <= j){
                    System.out.print(arr[i][j] + " ");
                 }
                else{
                    System.out.print("  ");

                }
            } //end of inner for
            System.out.println();
        }

        // lowerTriangular ele

        for(int i = 0; i<n; i++){
            for(int j =0; j<n; j++){

                if( i >= j){
                    System.out.print(arr[i][j] + " ");
                }
                else{
                    System.out.print("  ");

                }
            } //end of inner for
            System.out.println();
        }
    }

}
