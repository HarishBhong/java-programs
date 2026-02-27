package JavaBasics.week3.nestedLoops_patterns;

import java.util.Scanner;

/*
i/p n =5;
o/p pattern:
1       1
 2     2
  3   3
   4 4
    5
   4 4
  3   3
 2     2
1       1
 */
public class c11_cross_no_ptn {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter no of rows:");
        int n = in.nextInt();

        //upper part:

        int leftSpace = 0;
        int middleSpace = 1 + 2 * (n-2); //main logic

        for(int i = 1; i <= n; i++)
        {
            //left space
            for( int l =1; l <= leftSpace; l++ )
            {
                System.out.print(" ");
            }
            leftSpace = leftSpace + 1; //0 1 2 3 4

            System.out.print(i);

            //middle space
            for( int m = 1; m <= middleSpace; m++ )
            {
                System.out.print(" ");
            }
            middleSpace = middleSpace - 2; //7 5 3 1

            if(i != n) {
                System.out.println(i);
            }
        }

        System.out.println();

        //lower part

        leftSpace = n - 2;
        middleSpace = 1;

        for(int i = n-1 ; i >= 1; i-- )
        {
            //leftSpace
            for(int l = 1; l <= leftSpace; l++) {
                System.out.print(" ");
            }
            System.out.print(i);
            leftSpace = leftSpace - 1; //3 2 1 0

            //middle space
            for(int m = 1; m <= middleSpace; m++)
            {
                System.out.print(" ");
            }

            System.out.println(i);
            middleSpace = middleSpace + 2; //7 5 3 1
            
        }
    }
}
