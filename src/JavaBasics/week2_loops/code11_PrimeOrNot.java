package JavaBasics.week2_loops;
// check if number is prime or  not

import java.util.Scanner;
public class code11_PrimeOrNot {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter number :");
        int n = in.nextInt();
        int count = 0;

        for(int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                count++;
            }
        }

        if(count>2){
            System.out.println(n + " is Not Prime");
        } else
        {
            System.out.println(n + " is Prime");
        }
    }

}
