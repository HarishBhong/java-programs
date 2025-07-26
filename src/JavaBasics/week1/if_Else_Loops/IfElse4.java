package JavaBasics.week1.if_Else_Loops;

//2. Program to check whether a number is divisible by 5 and 11 or
//not.

import java.util.Scanner;
public class IfElse4 {
    public static void main(String[] args) {

        Scanner var;
        var = new Scanner(System.in);

        System.out.println("Enter Number :");
        int num = var.nextInt();

        //check divisible by 5 and 11

        if(num % 5 == 0 ) {
            System.out.println(num+" is divisible by 5 ");
        }else{
            System.out.println(num +" is not divisible by 5");
            }

        if(num % 8 == 0 ) {
        System.out.println(num+" is divisible by 8 ");
        }else{
            System.out.println(num+ " is not divisible by 8");
            }

    }
}
