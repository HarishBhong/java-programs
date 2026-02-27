package DSAweek7_stack.lec35;

import java.util.Stack;

public class stack_operations {

    public static void main(String[] args )
    {
        //Syntax: Stack<datatype> name_it = new Stack<>();    note : Stack -> S is Capital

        Stack<Integer> new_stack = new Stack<>();

        // push() -> to enter new element in stack
        new_stack.push(10);
        new_stack.push(20);
        new_stack.push(30);

        System.out.println(new_stack);  // see how stack is shown / printed as array

        System.out.println(new_stack.peek());  // peek() returns top element on stack
        // last element to enter is 30. so using peek() we get 30 output

        new_stack.pop();
        System.out.println(new_stack);
        System.out.println(new_stack.pop()); //this line will remove top element -> BUT note that it also returns that top element which is deleted
        System.out.println(new_stack);

    }
}
