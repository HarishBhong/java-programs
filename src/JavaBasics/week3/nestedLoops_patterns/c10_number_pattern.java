package JavaBasics.week3.nestedLoops_patterns;
/*
input = 5:
o/p pattern:
1
12
123
1234
12345
1234
123
12
1
 */

//NOTE: whenever we see pattern changing shape. divide the pattern in two parts--> upper and lower --> and apply logic seperately
import java.util.Scanner;
public class c10_number_pattern {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter no of rows:");
        int n = in.nextInt();

        //upper part: i=1, j=1
        //            i=2, j=1,2
        //            i=3, j=1,2,3
        for(int i = 1; i <= n; i++)
        {
            for( int j =1; j <= i; j++ )
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }

        //lower part
        // i= 4, j=1234
        //i= 3, j=123
        //i= 2, j=12
        //i= 1, j=1
        for(int i = n-1; i > 0; i--)
        {
            for( int j = 1; j <= i; j++ )
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
