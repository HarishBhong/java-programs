package JavaBasics.week1.if_Else_Loops;
import java.util.Scanner;
public class IfElse3 {
    public static void main(String[] args) {
        Scanner var;
        var = new Scanner(System.in);

        System.out.println("Enter year");
        int year = var.nextInt();

System.out.println("by first logic:");
        if ( year % 4 == 0) {

            // Divs by 4 But Not Divs by 100 => LEAP
            if( year % 100 != 0){
                System.out.println("LEap year");
            }

            //Divs by 4 & 100 & 400 => leap
            if ((year % 100 == 0) && (year % 400 == 0)) {
                System.out.println("its a LEAP year !!!");
            }

            //Divs by 4 & 100 but Not Divs by 400 => Leap
            if(year % 100 == 0 && year % 400 != 0){
                System.out.println("Not Leap Year !!!");
            }

        }else{
            System.out.println("Not LEAP year !!!");
        }

//        OR the logic of nested if else
System.out.println("by seco0nd logic:");
        if (year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Leap year (if of 3rd L)");
                }else{
                    System.out.println("Not a Leap year (else of 3rd L)");
                }
            }else{
                //2012, 2016, 2004
                System.out.println("Leap year (else of 2nd L)");
            }
        }else{
            System.out.println("Leap year (else of 1st L)");
        }
    }
}
