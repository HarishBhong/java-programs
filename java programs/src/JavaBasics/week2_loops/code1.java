package JavaBasics.week2_loops;
//Program to find the sum of all digits in given number

import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {

        Scanner svar = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = svar.nextInt();

        int sum =0;

        while(num>0){
            int lastDigit = num % 10 ; //find last digit by %10

            sum = sum+lastDigit;  //keep adding last digit one by one

            num = num/10;
        }
        System.out.println(sum);  //remove last digit by /10
    }
}
