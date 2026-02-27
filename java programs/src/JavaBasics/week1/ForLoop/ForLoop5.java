package JavaBasics.week1.ForLoop;
//find multiplication table of any number
import java.util.Scanner;
public class ForLoop5 {
    public static void main(String[] args) {
            
    Scanner in = new Scanner(System.in);

    System.out.println("Enter number to get its multiplication table: ");
    int num = in.nextInt();
    for(int i = 1; i <= 10; i++ ){
        System.out.println(num + " * " + i + " = " + num * i );

    }
    }
}

