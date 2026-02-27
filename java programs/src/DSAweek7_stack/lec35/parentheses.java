package DSAweek7_stack.lec35;


//check valid parenthses -> if only one type of bracket is given then consider +1 for opening bracket and -1 for closing bracket. and take sum variable, if sum < 0 then invalid. NO need to use any data structure
// if que has multiple type of brackets ( { [ then use stack


import java.util.*;

class Solution {
    //([{}]
    public boolean isValid(String s){

        Stack<Character> stack = new Stack<Character>();

        int n = s.length();
        // ()[]{}
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            // opening bracket
            if( ch=='(' || ch =='[' || ch=='{')
            {
                stack.push(ch);
            }

            else {
                //if closing bracket
                //but if stack is empty

                if (stack.empty()) {
                    return false; // if not true means -> now no opening bracket, so now if empty then inValid
                }

                //handle condition if closing not match with its opening bracket

                if (ch == ')' && stack.peek() !='(') return false;
                if (ch ==']' && stack.peek() !='[') return false;
                if (ch =='}' && stack.peek() !='{') return false;

                // now it matched with opening bracket we have to pop() the matched opening bracket
                stack.pop();
            }
        }
    return (stack.empty());

    }

}

public class parentheses {
    public static void main(String[] args)
    {

        Solution sol = new Solution(); //obj creation

        System.out.println(sol.isValid("([{[}])"));


    }
}
