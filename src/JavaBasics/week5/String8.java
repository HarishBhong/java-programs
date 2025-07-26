package JavaBasics.week5;
/*
Find the maximum occurring element in the string
eg: i/p : string = " in love codeForWin"
o/p : maximum occurring element = o

 */
/* lets solve using Fixing technique:
fix (i) at one element and then traverse the string
count occurrence of that i th element.

in same way traverse string and count occurrences of each of the elements.

*/
import java.util.Scanner;
public class String8 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("enter String: ");
        String s = in.nextLine();

        //s = i love codeForWin

        int maxF = 0;
        char maxChar = 0; //initialisation is necessary. ie. char maxChar; --> will give compilation error.
                                                        //  char maxChar = 0; --> this is correct ie. initialise with some value
        for(int i = 0; i < s.length(); i++)
        {
            int freq_Of_i = 0;
            //char charToCheck = s.charAt(i);
            for(int j = 0; j< s.length(); j++)
            {
                 if( s.charAt(i) == s.charAt(j))
                    {
                        freq_Of_i ++;
                    }
            }

            if(freq_Of_i > maxF){
                maxF = freq_Of_i;
                maxChar = s.charAt(i);
            }
        }

        System.out.println("max char: "+ maxChar);
        System.out.println("max freq: "+maxF);

    }
}
