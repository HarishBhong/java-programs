package JavaBasics.week3.nestedLoops_patterns;

/*
print output:

     *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *


 */

//divide the pattern in two parts -- 1st: 1, 3, 5, 7, 9 stars
//                                -- 2nd: 7, 5, 3, 1 stars

import java.util.Scanner;
public class c5_dimond_pattern {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter n ");
        int n = in.nextInt();

        int space = n-1;
        int star = 1;

        //STEP 1 -- print upper part
        for(int i = 1; i <= n; i++)
        {
            //space
                for(int j=1; j <= space; j++)
                {
                    System.out.print(" ");
                }

            //star
            for(int j=1; j <= star; j++)
            {
                System.out.print("*");
            }

            space = space - 1;
            star = star + 2 ;
            System.out.println(" ");
        }

        space = 1;
        star = star - 4; //VERY imp Logic
        //STEP 2 -- print lower part
        for(int i = 1; i <= n-1; i++)
        {
            //space
            for(int j=1; j <= space; j++)
            {
                System.out.print(" ");
            }

            //star
            for(int j=1; j <= star; j++)
            {
                System.out.print("*");
            }

            space = space + 1;
            star = star - 2 ;
            System.out.println(" ");

        }
    }
}
