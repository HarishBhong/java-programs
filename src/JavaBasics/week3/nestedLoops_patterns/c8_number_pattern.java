package JavaBasics.week3.nestedLoops_patterns;
/*
output pattern:
if input = 5:

12345
1234
123
12
1

 */
import java.util.Scanner;
public class c8_number_pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter no of rows:");
        int n = in.nextInt();

        for(int i = n; i > 0; i--)
        {
            for( int j =1; j <= i; j++ )
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
