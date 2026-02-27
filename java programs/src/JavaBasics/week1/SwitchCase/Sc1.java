package JavaBasics.week1.SwitchCase;

// print week of the day using switchcase

import java.util.Scanner;
public class Sc1 {
    public static void main(String[] args) {

        System.out.print("Enter number 1 - 7 : ");
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

        switch(day) {

            case 1: {
                System.out.println("Mon");
                break;
            }
            case 2: {
                System.out.println("Tue");
                break;
            }
            case 3: {
                System.out.println("wed");
                break;
            }
            case 4: {
                System.out.println("thu");
                break;
            }
            case 5: {
                System.out.println("Fri");
                break;
            }
            case 6: {
                System.out.println("Sat");
                break;
            }
            case 7: {
                System.out.println("Sun");
                break;
            }
            default: {
             System.out.println("Invalid input :");
            }
            }
        }
}


