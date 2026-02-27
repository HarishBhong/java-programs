package JavaBasics.week5;

/*

multiplication of two matrix of same size
 */
import java.util.Scanner;
public class c8_matrixProduct {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter size of A:");
        int n = in.nextInt();
        int[][] A = new int[n][n];

        System.out.println("enter matrix A:");
        for(int i = 0; i< n; i++ ) {
            for (int j = 0; j < n; j++)
            {
                A[i][j] = in.nextInt();
            }
        }

        System.out.println("enter size of B:");
        int m = in.nextInt();
        int[][] B = new int[m][m];

        System.out.println("enter matrix B:");
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < m; j++)
            {
                B[i][j] = in.nextInt();
            }
        }
        System.out.println();

        //matrix to store product
        int[][] C = new int[n][m];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                int newElement = 0;
                for(int k = 0; k < n; k++)
                {
                    
                }
            }
        }

        


    }
}
