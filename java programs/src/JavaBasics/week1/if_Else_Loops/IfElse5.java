package JavaBasics.week1.if_Else_Loops;

// program to find if the character is digit or an alphabet

import java.util.Scanner;
public class IfElse5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter input (without any special char) :");
        char ch = in.next().charAt(0);
        // next() ==> used for taking string as input
        // .charAt() ==> builtin fun of string, for extraction nth character

        int value = ch; // this is type casting
                        // integer value will store ASCII int values of ch character

        if(value >= 65 && value <= 90 || value >= 97 && value <= 122){
            System.out.println("its an alphabet");
            System.out.println("its ASCII value is "+value);
        }
        else{
            System.out.println("its a digit");
        }
    }
}
