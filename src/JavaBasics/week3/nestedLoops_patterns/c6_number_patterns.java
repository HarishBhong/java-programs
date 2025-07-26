package JavaBasics.week3.nestedLoops_patterns;

/*
print this pattern:

1
12
123
1234
12345

 */

import java.util.Scanner;

public class c6_number_patterns {
    public static void main(String[] args) {

    Scanner svar = new Scanner(System.in);
    System.out.println("enter no of rows:");
    int n = svar.nextInt();

    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= i; j++)
        {
            System.out.print(j);
        }
        System.out.println(" ");
    }
    }
}
