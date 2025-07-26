package JavaBasics.week2_loops;

//print prime nos from a to b

import java.util.Scanner;
public class code12_prime_upto_n {


    public static boolean prime(int n)
    {
        int count=0;

        for(int i = 1; i <= n; i++) {
            if (n % i == 0)
            {
                count++;
            }
        }

        if(count<=2) {
            return true;
        }
        else{
            return false;}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter stating no:");
        int a = in.nextInt();

        System.out.println("enter ending no:");
        int b = in.nextInt();


        for(int i = a ; i <= b; i++)
        {
            if(prime(i)){
             System.out.println(i);
            }
        }

    }
}
