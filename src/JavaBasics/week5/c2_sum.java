package JavaBasics.week5;
/*
print sum of each row from matrix
and column wise

 */

import java.util.Scanner;
public class c2_sum {
    public static void main(String []args){

        int [][]arr = new int[3][3];
        Scanner var = new Scanner(System.in);

        //input 3x3 matrix
        System.out.println("enter matrix:");
        for(int i = 0; i<3 ; i++){
            for(int j = 0; j<3; j++){
                arr[i][j] = var.nextInt();
            }
        }

        //print matrix
        for(int i = 0; i<3 ; i++){
            for(int j = 0; j<3; j++){
               System.out.print(arr[i][j] + "  ");
            } System.out.println();
        }

        //row wise means (00 + 10 + 20) (10 + 11 + 12) (20 + 21 + 22)
        System.out.println("row wise sum :");
        for(int i = 0; i<3 ; i++){
            int sum = 0;
            for(int j=0; j<3; j++){
                sum += arr[i][j];
            }
            System.out.println("sum of row " + i + " = "+ sum );
        }
        System.out.println();

        // (00+10+20) (01+11+21)
        System.out.println("Column wise sum :");
        for(int i = 0; i<3; i++){
            int sum =0;
            for(int j = 0; j<3; j++){
                sum += arr[j][i];
    }
            System.out.println("sum of col " + i + " = "+ sum );
}
        System.out.println();

        //sum of diagonal elements :
        // diagonal where i == j
        int sumL =0;
        System.out.println("left diagonal elements are: ");

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                if( i == j) {
                    System.out.print(arr[i][j] + " ");
                    sumL += arr[j][i];
                }
            }
        }
        System.out.println();
        System.out.println("sum of left diagonal elements: "+ sumL );

        System.out.println();
        //sum of right diagonal elements
        // how to find Right diagonal ? --> if(i + j) == n-1 --> then its right diag elem
        // where n = no of col = no of rows
        int sumR = 0;
        int n =3;
        System.out.println("Right diagonal elements are: ");

        for(int i = 0; i<3; i++){
            for(int j = 0; j< 3; j++){
                if(i + j == n-1){
                    System.out.print(arr[i][j] + " ");
                    sumR += arr[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("sum of right diag ele :"+sumR);
    }
}

