package JavaBasics.week5;

/*
Reverse a string
 */
import java.util.Scanner;
public class String4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringBuilder sB = new StringBuilder(s);

        int i = 0;
        int j = sB.length()-1;

        while(i<j)
        {
            //swap -- S[i] and S[j]
            char temp = s.charAt(i);
            sB.setCharAt(i, s.charAt(j)); //changes char at 1st parameter index to 2nd parameter index
            sB.setCharAt(j, temp);

            i++;
            j--;
        }
        System.out.println(sB);
    }
}
