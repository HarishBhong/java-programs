package JavaBasics.week3.nestedLoops_patterns;

/*

input = 5:
output pattern:
12345
2345
345
45
5

 */


import java.util.Scanner;
public class c9_number_pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter no of rows:");
        int n = in.nextInt();


        //i = 1, j = 1,2,3,4,5
        //i = 2, j = 2,3,4,5
        //i = 3, j = 3,4,5
        for(int i = 1; i <= n; i++)
        {
            for( int j = i; j <= n; j++ )
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
