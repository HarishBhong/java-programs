package JavaBasics.week5;
/*
check if string is palindrome
 we will use 2 pointers--> i will go from low to high index
                       --> j will go from high to low index
 and compare ith and jth element at each step
 if charAt(i) == charAt(j) --> i++ & j--
 else 'Not palindrome'
 if i > j --> 'Not palindrome'
 */
import java.util.Scanner;
public class String3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(s);

        int i =0;
        int j = s.length()-1;
        boolean flag = true;
        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                flag = false;
                break;
            }

            i++;
            j--;
        }

        if(flag) //shortform of : if(flag == true)
        {
            System.out.println("is palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }

    }
}
