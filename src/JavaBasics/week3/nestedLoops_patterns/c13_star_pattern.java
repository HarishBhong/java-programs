package JavaBasics.week3.nestedLoops_patterns;
/*
i/p: n = 5;
o/p patter:

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

 */

/*
Logic: rows = n*2
        divide pattern into 2 parts upper/ lower
        each part has leftSpace and rightSpace


 */
import java.util.Scanner;
public class c13_star_pattern {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter no of rows:");
        int n = in.nextInt();

        //upper part:

        int space = 0;
        int stars = n;

        //upper part
        for(int i = 1; i <= n; i++)
        {
            //stars
            for(int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            //space
            for(int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            stars = stars - 1;
            space = space + 2;
        System.out.println();
        }

//        System.out.println();

        //lower part
        stars = 1;
        space = space - 2; // space value is updated from, which is returned by upper part

        for(int i = 1; i <= n; i++)
        {
            //stars
            for(int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            //space
            for(int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            stars = stars + 1;
            space = space - 2;
            System.out.println();
        }


    }

}

