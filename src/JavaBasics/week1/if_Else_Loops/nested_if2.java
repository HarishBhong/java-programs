package JavaBasics.week1.if_Else_Loops;

import java.util.Scanner;
public class nested_if2 {
    public static void main(String[] args) {

        Scanner var;
        var = new Scanner(System.in);

        System.out.println("enter age :");
        int a =var.nextInt();
        System.out.println("Years of experience :");
        int b =var.nextInt();
        System.out.println("Current salary");
        int c =var.nextInt();
        System.out.println("Worked for Number of Companies till now :");
        int d =var.nextInt();

        if(a >= 25 && a<= 50){
            if( b >= 5){
                if(c >= 50000){
                    if( d >= 3 && d <= 5){
                    System.out.println("you are eligible to apply !!!");
                    }else{
                        System.out.println("4th criteria not satisfied. Sorry cant apply !");}
                }else{
                    System.out.println("Salary criteria not satisfied. Sorry can not apply");}
            }else{
                System.out.println("need more experienced candidate, Sorry !");}
        }else{
            System.out.println("age criteria not satisfied, Sorry ");}

    }

}
