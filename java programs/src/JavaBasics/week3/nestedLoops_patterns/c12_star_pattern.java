package JavaBasics.week3.nestedLoops_patterns;
/*
i/p n = 5;
o/p pattern:

    *****
   *   *
  *   *
 *   *
*****

 */
/*
leftSpace: = 4,3,2,1,0 --> ie. start with n-1

middleSpace = if(i==1 OR i==n) print (n-2) stars
              else print * (n-2) spaces *


 */


import java.util.Scanner;
public class c12_star_pattern {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter no of rows:");
        int n = in.nextInt();

        int leftSpace = n-1;
        //i=1 --> 4 spaces
        for(int i = 1; i <= n; i++)
        {
            //left spaces
            for( int j =1; j <= leftSpace; j++ )
            {
                System.out.print(" ");
            }
            leftSpace = leftSpace - 1;
            if(i == 1 || i == n)
                {
                    for(int j = 1; j <= n ;j++)
                    {
                        System.out.print("*");
                    }
                }
            else{
                System.out.print("*");
                    for(int j = 1; j<= n-2; j++)
                    {
                        System.out.print(" ");
                    }

                    System.out.print("*");
            }

        System.out.println();

        }

    }
}
