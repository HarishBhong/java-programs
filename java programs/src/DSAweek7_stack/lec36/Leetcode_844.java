package DSAweek7_stack.lec36;
import java.util.*;

class Solution {

    //LOGIC: take given string -> create stack -> if '#' - pop() the top element on stack -> then return remaining elements stroing it in string

    public static String result(String a) // this function will return a string after doing those backspace operations and removing #
    {
        int l = a.length();

        Stack<Character> st = new Stack<>();
        for(int i = 0; i < l; i++)
        {
            if(a.charAt(i) == '#')
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }

            }
            else{
                st.push(a.charAt(i));
            }
        }

        // now we want to convert this cleared stack to string, so that we can compare strings
        //using StringBuilder bcoz its easy to handle than string
        StringBuilder s = new StringBuilder("");

        while(!st.empty())
        {
            s.append(st.pop());  // append all elements to string s and pop from st stack (make stack empty)
        }
        return s.toString();  //function of StringBuilder that needs to be returned
        // this s is now final string after doing all the backspace operations
    }

    public static boolean backspaceCompare(String s, String t) {

        String A = result(s);
        String B = result(t);


        if(A.length() != B.length())
        {
            return false;
        }
        else
        {
            for(int i = 0; i< A.length() ; i++)
            {
                if(A.charAt(i) != B.charAt(i))
                {
                    return false;
                }
            }
            return true;
        }

    }
}

public class Leetcode_844 {
    public static void main(String[] args)
    {
        System.out.println(Solution.backspaceCompare("ab#c","abb##cf#"));
    }
}
