package JavaBasics.week2_loops;
//sum of digits of all numbers from 1 to N ;

import java.util.Scanner;
public class code3 {
    public static void main(String[] args) {

        Scanner svar = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = svar.nextInt();

        int total = 0;
        // forLoop --> go from 1 to N
        for(int i=1; i <= n; i++){

            //then find sum of digits of every number
            int x = i; // x is copy of i. x is used so value of i in forLoop is not affected by Whileloop.<--THINK (x is called copy of i)
            int sum=0;

            while( x > 0){

                int LastDigit = x % 10;
                sum = sum + LastDigit;
                x = x / 10;
            }
            System.out.println(i + "-->"+ sum);
            total= total + sum;

        }
        System.out.println("Total sum of digits of numbers from 1 to "+n+" is "+total);
    }

}
