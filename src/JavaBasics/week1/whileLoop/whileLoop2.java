package JavaBasics.week1.whileLoop;
//Program to find the sum of all digits in given number

import java.util.Scanner;
public class whileLoop2 {
    public static void main(String[] args) {

        Scanner svar = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = svar.nextInt();

        int sum =0;

        while(num>0){

            //logic is adding digits from backwards
            //eg 12345 will be added as--> 5+4+3+2+1

            int lastDigit = num % 10 ; //find last digit by %10

            sum = sum+lastDigit;  //keep adding last digit one by one

            num = num/10;      //remove last digit. (Bcoz it is added);
        }
        System.out.println(sum);  //remove last digit by /10
    }
}
