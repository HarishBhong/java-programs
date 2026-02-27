package JavaBasics.week1.ForLoop;
// Program to find sum of all even numbers between 1 to n.

import java.util.Scanner;
public class ForLoop3 {
    public static void main(String[] args) {

        Scanner var = new Scanner(System.in);

        System.out.println("Enter Ending Number ");
        int a = var.nextInt();
        int sum = 0;

        for(int i = 2; i <= a; i=i+2 ){
            sum = sum + i;
        }
        System.out.println("Sum of even numbers from 1 to "+a+" is "+sum);

    }
}
