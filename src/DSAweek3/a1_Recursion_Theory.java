package DSAweek3;
// 15, 17
/*

Steps to think while solve recursion:::
1. recursion ke 'parameter' --> kya ho sakte hai?
2. recursive case           --> kya hoga? --> options concept by Saksham Arora
3. base case                --> increasing or decreasing recursion
4. return                   -->  kya karna hai?

What is recursion -->
                       when a function calls itself, this phenomenon is called recursion
Recursion is a programming technique where a function calls itself to solve smaller sub-problems of the original problem.

 void MyFunction(){
    .....
    MyFunction();
    ....
 }

Why recursion concept?
-> problems related to for Loop can be solved easily using recursion concept
eg. printing numbers from 1---to---n ; we know-->it can be solved using for loop
                                       But recursion can make it simple and short code for this problem


recursion has 3 parts
1--> logic -> print, or do any other operation
2--> Base case --> line of code that acts as condition to stop recursion --> function stops calling itself
3--> Recursive case --> line of code where recursion takes place --> ie. where function calls itself

eg.
void printNum(int i, int n) {
    if (i > n) return;             // base case
    System.out.println(i);         // Logic / work
    printNum(i + 1, n);        // recursive call --> printNum(){ .....printNum()...} --> this is recursion
}

NOTE --> Base case must always be before Recursive case --> recursion will go into infinite loop :it causes infinite recursion and a StackOverflowError.

************************************************************************************************************************

You can solve almost any recursive problem using this template:

void recursiveFunction(parameters) {
    if (base condition) {
        return;
    }

    // Logic / work

    recursiveFunction(smaller input);  // recursive call
}

 */
public class a1_Recursion_Theory {

    static void printNum(int i, int n) {
        // Base condition: stop when i > n
        if (i > n) {
            System.out.println("Backtracking now since i = " + i + " > " + n);
            return;
        }

        System.out.println("Entering function call: i = " + i);
        printNum(i+1, n); // recursive call

        System.out.println("Exiting function call: i = " + i + " But running other leftover program. which was left because went for recursion" );
    }

    // Main method: Starting point of the program
public static void main(String[] args){
    int n = 3;
    printNum(1,n);
}
}


/*

The call stack is like a stack of plates in memory:------------------------------------
-->Every time a function is called, it’s pushed onto the stack.
-->When a function finishes (ie. when it hits a return), it’s popped from the stack.
-->This LIFO behavior (Last-In-First-Out) is what makes recursion work.

** Backtracking	--> The process of returning from recursive calls.
                --> backtracking is done using Call Stack

above code -->
   call stack - printNum(1,3) --> calls printNum(2,3) --> calls printNum(3,3) --> calls printNum(3,4) -->hits baseCase and stops -> Returns
                then what?
                remember we are still in the functions none of the function is fully executed,
                call stack backtracks
                printNum(4,3) -->popped from stack --> then printNum(3,3) --> it is checked if any other part of this function is left to execute. if yes: execute it. and terminate this function --> pop from stack
                                                       then printNum(2,3) --> it is checked if any other part of this function is left to execute. if yes: execute it. and terminate this function --> pop from stack
                                                       then printNum(1,3) --> it is checked if any other part of this function is left to execute. if yes: execute it. and terminate this function --> pop from stack
                                                       stack is empty now




 */