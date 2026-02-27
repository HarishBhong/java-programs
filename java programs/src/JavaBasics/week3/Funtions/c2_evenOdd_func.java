package JavaBasics.week3.Funtions;
//check even using boolean function
import java.util.Scanner;
public class c2_evenOdd_func {

    public static boolean iseven(int n){
        if(n % 2 == 0){
           return true;
        }
        else
        {return false;}
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter number:");
        int n = in.nextInt();

        System.out.println(iseven(n));
    }

}
