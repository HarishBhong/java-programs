package JavaBasics.week1.whileLoop;

// program to count number of digits in the number
import java.util.Scanner;

public class whileLoop1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter positive number:");
        int num = in.nextInt();

        int count = 0;

        while(num>0){
            count ++;
            num = num /10;
        }
        System.out.println(count);


    }
}
