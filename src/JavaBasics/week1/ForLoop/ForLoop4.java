package JavaBasics.week1.ForLoop;
//print odd numbers from 0 to n
import java.util.Scanner;
public class ForLoop4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter endpoint of loop :");
        int n = in.nextInt();

        for(int i =  1; i <= n; i = i+2)
        {
            System.out.print(i+", ");
        }



    }
}
