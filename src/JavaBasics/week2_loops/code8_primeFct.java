package JavaBasics.week2_loops;

//program to find Prime factors of a number

//step 1- go from 1 to n, to find n's factors --> forLoop{ if loop }
//step 2- check if any factor is prime

import java.util.Scanner;
public class code8_primeFct {

    //function to find if number is prime or not
    public static boolean prime(int p)
    {
        int count = 0;
        for(int i = 1; i <= p; i++)
        {
            if(p % i == 0){
                count++;
            }
        }
        //if more than 2 divisors not prime
        if(count == 2){
            return true;}
        else {
            return false;}
    }

    public static void main(String[] args) {
        Scanner svar = new Scanner(System.in);

        System.out.println("enter number : ");
        int n = svar.nextInt();

        for(int i = 1; i <= n ; i++ ){

                if( n % i == 0 && prime(i)) //OR--> this can also be used: if( n % i == 0 && prime(i) == true )
                {
                    System.out.println(i);
                }
            }
        }
    }


