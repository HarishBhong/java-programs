package JavaBasics.week3.nestedLoops_patterns;

//print output:

/*

1
21
321
4321
54321

 */
import java.util.Scanner;
public class c7_number_pattern {

    public static void main(String[] args) {


        Scanner svar = new Scanner(System.in);
        System.out.println("enter no of rows:");
        int n = svar.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = i; j > 0; j--)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }

    }
}
