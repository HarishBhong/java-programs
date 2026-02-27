package JavaBasics.week2_loops;
//program to find all the factors of a number

import java.util.Scanner;

public class code14_find_all_factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter number:");

        int n = in.nextInt();

        for(int i=1; i <=n ; i++ ){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }
}
