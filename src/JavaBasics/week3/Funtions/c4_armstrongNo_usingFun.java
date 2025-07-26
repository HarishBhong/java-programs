package JavaBasics.week3.Funtions;
//check if the given number is armstrong using funtion

import java.util.Scanner;
public class c4_armstrongNo_usingFun {

    // user defined powerFn to get ==> a^b
    //for numbers larger than 5 digits, long datatype must be used
    public static int powerFn(int a, int b)
    {
        int power = 1;
        for(int i=1; i<=b; i++) {
            power = power * a;
        }
        return power; //returns a^b
    }

    //formula
    public static int sumArmstrong(int n)
    {
        int copyn = n;
        //no of digits in n
        int nuOfDigits = 0;
        while(n > 0){
            nuOfDigits++;
            n = n/10;
        }
        //here n becomes 0

        //calculation
         n = copyn;
        int sum = 0;

        while(n > 0){
                int lastDigit = n % 10;
                sum = sum + powerFn(lastDigit, nuOfDigits);
                n = n/10;
            }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number:");
        int n = in.nextInt();

        if( sumArmstrong(n) == n)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }

    }
}
