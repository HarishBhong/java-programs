package JavaBasics.week2_loops;

//program to find armstrong numbers from 1 to n

import java.util.Scanner;
public class code7_armstrongNo {

    // user defined powerFn to get ==> a^b
    public static int powerFn(int a, int b)
    {
        int answer = 1;
        for(int i=1; i<=b; i++) {
            answer = answer * a;
        }
        return answer;
    }

    //check armstrong or not
    public static boolean isArmstrong(int n)
    {

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
            return true;
            //System.out.println("Armstrong number");
        }
        else{
            return false;
            //System.out.println("not Armstrong number");
        }

    }

    public static void main(String[] args){

        Scanner svar = new Scanner(System.in);

        System.out.println("enter starting number: ");
        int start = svar.nextInt();

        System.out.println("enter ending number: ");
        int end = svar.nextInt();

        for(int i = start; i <= end; i++ )
        {
            if(isArmstrong(i) == true ){
                System.out.println( i);
            }
        }

    }



}
