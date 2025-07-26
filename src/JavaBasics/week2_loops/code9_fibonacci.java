package JavaBasics.week2_loops;
//program to get fibonaccin series upto n terms(Let n > 2)-->0 1 1 2 3 5.....

import java.util.Scanner;
public class code9_fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter number :");
        int n = in.nextInt();

        // 1st and 2nd Terms are fixed 0 and 1
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print(firstTerm + " " + secondTerm + " ");
        //now n = n-2 ; as two terms are already known
        n = n - 2;

        while(n > 0){
            int thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;

            System.out.print(thirdTerm + " ");

            n--;
        }
    }

}
