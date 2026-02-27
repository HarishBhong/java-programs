package DSAweek7_stack.lec35;

public class a1_stack {
}

/*
RECAP:

array - many ques and concepts revolve around ararys (wide topic)
linkedlist-

Stack is linear data structure that follows LIFO
stack - > LIFO

ex: plates put on one another, books stack
eg: stack memory :- function calls are stored in the form of stack

works similar to like "backspace" button

a, b , c , f -> remove last inserted element -> means execute stack here

questions --> when asked for finding the last inserted values, it is asking for using stack data structure

1. UNDO operation

eg. prepare a word editor. if we have words abc  def  xyz


call stack
1. we can use build in stack(java, cpp, py provides build in stack) -> and then only use functions or operations in stack
2. some problems may ask us to build our own stack-> array is used in such case to build our own stack

Operations on stack

- push() -> add element at top
- peek() -> view element at top
- pop() -> remove / delete element at top
- isEmpty() -> to check if stack empty: T if is empty and F if not Empty
- size() -> to check the size of stack

NOTE:
stack do not follow indexing
ie. stack.get(1) or stack.peek(3) this is conceptually wrong
- As all the operations will be performed on the top element, so there is no need of indexing and other elements can not be accessed directly

- Internally in java or any programming lang stack is coded mostly using array, sometimes arraylist or linkedlist
- uses pointer that always points the top element


Underflow -> condition when Trying to pop from an empty stack
Overflow -> condition when trying push on Full stack


System.out.println(stack.pop()) --> this line will remove that element and also return it at this step

 */
