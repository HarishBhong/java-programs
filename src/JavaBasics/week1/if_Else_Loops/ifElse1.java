package JavaBasics.week1.if_Else_Loops;

import java.util.Scanner;

public class ifElse1
{
    public static void main(String[] args) {

        Scanner var = new Scanner(System.in);

        int day = var.nextInt();


        if (day == 1){
            System.out.println("Monday");
        }
        else if(day == 2){
            System.out.println("Tuesday");
        }
        else if(day == 3){
            System.out.println("wednesday");
        }
        else if(day == 4){
            System.out.println("Thursday");
        }
        else if(day == 5){
            System.out.println("FRIDAY");
        }
        else if(day == 6){
            System.out.println("Saturday");
        }
    }
}
