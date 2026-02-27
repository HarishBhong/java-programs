package DSAweek7_stack.lec37;

// variety is asked often in companies -> this approach is applied to multiple varity ques

/* find the next greater element of the given array elements
eg: [1,3,2,4,7,6,10]

1-> next greater number is 3
3-> next greater number is 4
2-> next greater number is 4
4-> next greater number is 7
7-> next greater number is 10
6-> next greater number is 10
10-> last element -> no next greater element-> return -1

answer[] = [3,4,4,7,10,10]

means we have to return next greater number for each integer in array from array*/

import java.util.ArrayList;
import java.util.Stack;

class solution{

  public ArrayList<Integer> nextLargerElement(int[] arr) {

      int n = arr.length;
      ArrayList<Integer> result = new ArrayList<>();

      for (int i = 0; i < n; i++)
      {
        result.add(-1); // add -1 to all places of arraylist
      }

      Stack<Integer> st = new Stack<>(); //stack st stores index of elements in arr
      for(int i=0 ; i<n ; i++)
      {
          while(!st.isEmpty() && arr[i] > arr[st.peek()])  //while stack is nonEmpty && arr i-th element > arr[peek]: means   element
          {
              result.set(st.peek(), arr[i]); //means: result[st.peek()] = arr[i]
              st.pop(); // pop that element index which is has got its next greatest element
          }
          st.push(i);
      }
      return result;
  }
}

public class c1_NextGreaterInteger {
    public static void main(String[] args)
    {
        //int[] queArray = {1,3,2,4,7,6,10};
        int[] queArray = {5,4,3,2,1};
        solution soln = new solution(); //obj created to use class
        ArrayList<Integer> answer = soln.nextLargerElement(queArray);
        System.out.println(answer);

    }
}

/*dry run
queArray = {1,3,2,4,7,6,10}
nextLargerElement(queArray);

arr[] = {1,3,2,4,7,6,10}
n = 7
ArrayList<> result = [-1,-1,-1,-1,-1,-1,-1]

stack st = []

1.
for i=0:
        while -> st not empty -> false
            TFR while not run
        st.push(i) -> st = [0]

st=[0] , result = [-1,-1,-1,-1,-1,-1,-1]

2. for i=1:
        while -> st not empty -> true
              -> arr[i]:3 > arr[stack.peek()]:arr[0]:1 --> TRUE

              result.set( 0 , 3) => result = [3]
              st.pop() -> stack = []

              -> while checks again -> But st not empty so no iteration of while
        st.push(i) -> st = [1]

st =[1] , result =[3,-1,-1,-1,-1,-1,-1]

3. for i=2:
        while -> st not empty  -> TRUE
              -> arr[i]:2 > arr[st.peek]:arr[1]:3 -> False

            while donot run
            -result not modified
            -no pop operation
        st.push(i) -> st = [1,2]

4. for i = 3:
        while -> st not empty -> TRUE
              -> arr[i]:4 > arr[st.peek]:arr[2]: 2 -> TRUE --> means we have found next greater of element at arr[st.peek]

              result [st.peek] = arr[i]; --> result[2]

 */