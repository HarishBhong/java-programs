package DSAweek7_stack.lec37;

/*
 infix notation -> ((a+b)*c)/d))
 prefix notation -> /++abcd
 postfix notation -> ab +c* d/ --> also called Reverse Polish Notation
*/

// note : it will always be a valid sequence -> two operands and one operator
import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {

        int n = tokens.length;

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<n; i++)
        {
            if(tokens[i].equals("+"))
            {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a+b);
            }
            else if(tokens[i].equals("-") )
            {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a-b);
            }
            else if(tokens[i].equals("*"))
            {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a*b);
            }
            else if(tokens[i].equals("/"))
            {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a/b);
            }
            else{
                //if number
                stack.push(Integer.parseInt(tokens[i])); //parse "char"  into Integer as its integer stack
            }
        }
        return stack.pop();
    }
}

public class Leetcode150_evaluateRPN {
    public static void main(String[] args)
    {
        String[] tokens = {"2", "1", "+", "3", "*"};

        Solution sol = new Solution();
        int result = sol.evalRPN(tokens);

        System.out.println(result); // Output: 9
    }
}
