package JavaBasics.week1.if_Else_Loops;

import java.util.Scanner;
public record IfElse2() {
    public static void main(String[] args) {
        Scanner var;
        var =  new Scanner(System.in);

        System.out.println("enter the Number :");
        int a = var.nextInt();

        //positive and even/odd
        if(a > 0) {
            System.out.println("Number is Positive");
            if (a % 2 != 0) {
                System.out.println("Number is Odd");
            } else {
                System.out.println("Number is Even");
            }
        }

        //negative and (< or > than -10)
        if(a < 0 ){
            System.out.println("Number is Negative");
            if(a < (-10)){
                System.out.println(a+" is less than -10");
            }else{
                System.out.println(a+" is greater than -10");
            }
        }

        // zero
        if(a == 0){
            System.out.println("Number is zero");
        }

    }
}
