package JavaBasics.week1.if_Else_Loops;

import java.util.Scanner;
public class IfElse6 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("enter number from 1 to 7:");
        int day = in.nextInt();

        //if(day )
        if( day == 1 ) {
            System.out.println("Mon");
        }
        else if(day == 2){
            System.out.println("Tue");
            }
        else if(day == 3){
            System.out.println("Wed");
            }
        else if(day == 4){
            System.out.println("Thu");
        }else if(day == 5){
            System.out.println("Fri");
        }else if(day == 6){
            System.out.println("Sat");
        }else if(day == 7){
            System.out.println("Sun");
        }
    }
}
