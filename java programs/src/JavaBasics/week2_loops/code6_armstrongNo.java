package JavaBasics.week2_loops;

// Program to check weather a number armstrong or NOT

// eg. check 407 => NoOfDigit =3 => (4^3)+(0^3)+(7^3)       == 403  ==> .'. 403 is armstrong No
// eg. check 1023=> NoOfDigit=4  => (1^4)+(0^4)+(2^4)+(3^4) != 1023 ==> .'. 1023 is not armstrong No
// eg. check 25  => NoOfDigit =2 => (2^2)+(5^2)             != 25   ==> .'. 25 is not armstrong No

import java.util.Scanner;
public class code6_armstrongNo {

    // user defined powerFn to get ==> a^b
    public static int powerFn(int a, int b)
    {
        int answer = 1;
        for(int i=1; i<=b; i++) {
            answer = answer * a;
        }
    return answer;
    }


    public static void main(String[] args){

        Scanner svar = new Scanner(System.in);

        System.out.println("enter number: ");
        int n = svar.nextInt();

        int copyOfn = n; // we'll change the value of n. so let's maintain its copy to use later
        int nuOfDigits = 0;

        //no of digits in n
        while(n > 0){
            nuOfDigits++;
            n = n/10;
        }
        // here now after this while loop while of n becomes 0. hence we have to take its copy if we want it further with original value

        //actual logic is here
        n = copyOfn;
        int sum = 0;
        while(n>0)
        {
            int lastDigit = n % 10; //find last digit
            sum = sum + powerFn(lastDigit, nuOfDigits);

            n = n/10; //remove last digit
        }

        if(sum == copyOfn)
        {
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("not Armstrong number");
        }



    }
}
