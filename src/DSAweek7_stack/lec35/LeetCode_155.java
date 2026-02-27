package DSAweek7_stack.lec35;


import java.util.*;

class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack()
    {
        stack = new Stack<>();
        minStack= new Stack<>();  // we will maintain this stack for storing minimum element
    }

    public void push(int val)
    {
        stack.add(val);

        //always smallest element to be pushed in this stack - MinStack
        if(minStack.size() == 0)
        {
            minStack.add(val);
        }
        else{
            minStack.add(Math.min(val, minStack.peek()));
        }

    }

    public void pop()
    {
        stack.pop();
        minStack.pop();
    }

    public int top()
    {
        return stack.peek();
    }

    public int getMin()
    {
        return minStack.peek();
    }
}



public class LeetCode_155 {


}
