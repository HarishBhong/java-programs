package JavaBasics.week2_loops;

// find if the given number is a power of 2
// eg: 1 is power of 2 ==> 2^0=1
// eg: 8 is power of 2 ==> 2^3=8
//1, 2, 4, 8, 16, 32, 64, 128, 256 ...


//LOGIC -->
//step1 - check if number is divisible by 2 --> if at some point not divisible --> ie.(n != 1) --> then its not power of 2
//step2 - if yes divide it by 2. until we reach 1. --> if reached n=1 --> its power of 2

import java.util.Scanner;
public class code13_powerOf2 {


    public static boolean isPowerOfTwo(int n)
    {
        int copy = n;
        if(copy<=0){
            return false;
        }

        while(copy % 2 == 0)
        {
            copy = copy/ 2;
        }

        if(copy == 1){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {

        while(2 > 0)//just to make it infinite loop and ask for next number to check
            {
            Scanner in = new Scanner(System.in);
            System.out.println("enter number:");
            int n = in.nextInt();

            if (isPowerOfTwo(n)) {
                System.out.println(n + " is power of 2");
            } else {
                System.out.println(n + " is not a power of 2");
            }
        }
    }
}
