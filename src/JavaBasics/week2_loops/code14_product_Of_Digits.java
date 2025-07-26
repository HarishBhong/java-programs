package JavaBasics.week2_loops;
//program to find the product of all given digits

import java.util.Scanner;
public class code14_product_Of_Digits {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter number :");

        int n = in.nextInt();

        //int copyn = n;
        int product = 1;

        while(n>0){
           int lastDigit = n % 10;

          product = product * lastDigit;

           n = n/10;
        }
        System.out.println(product);
    }

}
