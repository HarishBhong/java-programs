package JavaBasics.week5;
/*
take i/p : string and target element to be searched, display all indices where target is present
o/p: all indices of the target element
 */
import java.util.Scanner;
public class String6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        System.out.print("enter target: ");
        char target = in.next().charAt(0);  //char --> primitive data type that stores only single character

        //basic traversal
        for(int i =0; i<s.length(); i++)
        {
            if(s.charAt(i) == target)
            {
                System.out.println(i);
            }
        }


    }
}
