package DSAweek6;
//lec30
//Linked list is implemented using classes and object references.
// class gives blue print that how each node(object) will look like, ie. what parameters will it have. class doesnot create any node of linkedlist
// class uses --> A constructor to initialize a node properly when it is created.
// An object is the actual node in memory.

class Node{
    int data;
    Node next;
    //Note --> here type of 'next' is Node(as class-> user defined datatype) . next will store Address
    /*Why is next of type Node?
    //Because:
    //“This node can point to another node of the same type”
    This is called a ""self-referential structure"" So that it stores only objects of type Node
     */
    Node(int d) //constructor
    {
        data = d;
        next = null;
    }
}

// here we are actually creating a class of name 'Node' -> then we are using its constructor for making objects
// below we are creating obj named 'head' for class 'Node'
// each obj will have 'data = d' and a next

public class c1_BasicsOFLinkedList {
        public static void main(String args[])
        {
            Node head = new Node(5); //head is an obj of class 'Node' Here we are calling its constructor
            System.out.println(head.data);

            Node newNode = new Node(6);
            head.next = newNode;

            // now 'next' reference variable of 'head' node -> stores address to reference variable of newNode

            // head, newNode -> are objects of class 'Node'
            // 'next' is reference variable of type of 'class Node'-> that

            //now linkedList looks like this :
            // [head: data = 5 | next = (nextNode)] --> [nextNode:data= 6 | next = null]

            //5 -> 6 -> null
        }


        /*
        stack memory:
            -stores names of the reference variables
            - head
            - newNode
            - head and newNode are NOT nodes. They only store addresses of nodes

        heap memory
            - stores Objects created using 'new'
            - 'new Node(5)' and 'new Node(6)'
            - data and next -> also stored in heap as they are inside objects
         */
}
