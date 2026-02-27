package DSAweek7_stack.lec36;
import java.util.*;
// program to store into string from a stack

// Case 1: Stack can be emptied

class StackEmptied{
    static String stackToString(Stack<Character> st)
    {
        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()){
            sb.append(st.pop());  // first it appends that element and then pops
        }
        return sb.toString(); //Take all characters stored in sb. -> Create a new String object -> Return that String

    }

}

//case2 : Stack should NOT be changed

class StackUnchanged{

}

class StackIntegerToString{

}

public class c1_StoringIntoStringFromStack {

    public static void main(String[] args)
    {
        Stack<Character> st1 = new Stack<Character>();
        st1.push('a');
        st1.push('b');
        st1.push('c');

        String Result1 = StackEmptied.stackToString(st1);
        System.out.println("first case: "+ Result1);
        System.out.println(st1.size());

    }




}
