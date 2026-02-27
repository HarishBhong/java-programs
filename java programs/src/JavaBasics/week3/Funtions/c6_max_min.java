package JavaBasics.week3.Funtions;

import java.util.Scanner;
public class c6_max_min {

    public static int max(int a,int b)
    {
        if(a > b){
            return a ;
        }
        else{
            return b ;
        }
    }
    public static int min(int a,int b)
    {
        if(a < b){
            return a ;
        }
        else{
            return b ;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 2 numbers :");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("max "+ max(a,b));
        System.out.println("min "+ min(a,b));
    }
}








