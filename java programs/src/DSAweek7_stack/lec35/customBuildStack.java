package DSAweek7_stack.lec35;


// prepare your own stack for performing LIFO and other basic operations on stack

// array or arraylist or LinkedList can be used to build own stack

import java.util.*;

class Mystack{
    ArrayList<Integer> arr;
    public Mystack(){
        arr = new ArrayList<>();
    }

    void push(int data){
        arr.add(data);
    }

    int peek(){
        return arr.get((arr.size() -1));
    }
    void pop(){
        arr.remove(arr.size() - 1);
    }
    int size(){
        return arr.size() - 1;
    }
}

public class customBuildStack {
    public static void main(String[] args)
    {
        Mystack newSt = new Mystack();

        newSt.push(1);
        newSt.push(2);
        newSt.push(3);

        while(newSt.size() >= 0)
        {
            System.out.println(newSt.peek());
            newSt.pop();
        }

    }

}
