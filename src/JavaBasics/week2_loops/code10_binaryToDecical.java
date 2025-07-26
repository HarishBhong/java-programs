package JavaBasics.week2_loops;
//Program to convert Binary to Decimal

//eg: 1010 = 10

//Logic --> multiply from RHS with 2^n. where n =0,1,2,3

import java.util.Scanner;
public class code10_binaryToDecical {

public static int powerFn(int a, int b){
    int answer = 1;
    for(int i = 0; i < b; i++){
        answer = answer * a;
    }
    return answer;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter binary number");
        int n = in.nextInt();

        int sum = 0;
        for(int i = 0; n > 0; i++){

            int lastDigit = n % 10;                       //find lastDigit

            //OPTIONAL
            // Check if the input is a valid binary number
            if (lastDigit != 0 && lastDigit != 1) {
                System.out.println("Invalid binary number!");
                return;
            }

            //main logic
            sum = sum + lastDigit * powerFn(2 , i);

            n = n /10;                                     //remove lastDigit
        }

        System.out.println(sum);

    }

}
