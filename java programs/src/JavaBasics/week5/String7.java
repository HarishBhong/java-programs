package JavaBasics.week5;
/*

i/p : string: I love programming. I love Codeforwin
    : word to be searched: love
o/p : 'love' is found at index: 2 , 22
 */

import java.util.Scanner;
public class String7 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String s  = in.nextLine();
        int l = s.length();
        System.out.print("enter target word: ");
        String target = in.nextLine();
        for(int i=0; i<l; i++)
        {
            for(int j=i; j<= target.length(); j++)
            {
                
            }
        }


    }
}
