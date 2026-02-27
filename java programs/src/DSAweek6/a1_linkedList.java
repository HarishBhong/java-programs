package DSAweek6;
//lec 30
/*
LinkedList -- is a Data Structure

why Linked list?? (1st we studied arrays/2D arrays/matrix) : --> insertion in linked list is easier than arrays.

dynamic array is --> ArrayList in java nd (vector in C++)

Array -> same datatype of elements stored in contiguous order
LinkedList -> elements stored in non-contiguous order

every element of linkedlist is called "Node"
Nodes are linked to each other sequentially

Node consists of -> value & Next pointer

Note --> insertion in linked list is easier than arrays.

pros's of linkedList
--> faster insertion deletion compared to array (just add node and change the next pointer of the prev node of that new added node

con's of Linkedlist
--> linked list do not have indexing of elements, Whereas array has indexes
--> Indexing not possible in linked list

A Linked List is a dynamic linear data structure in which elements, called nodes, are stored at non-contiguous memory locations.
Each node consists of:

Data field – stores the element
Link field – stores the address of the next (and/or previous) node
The nodes are connected using pointers, forming a chain-like structure.

Structure of a Node
+--------+---------+
|  Data  |  Link   |
+--------+---------+
The link contains the address of the next node
The last node’s link is NULL

** Need for Linked List
--Arrays have limitations such as fixed size and costly insertions/deletions.
--Linked lists overcome these limitations by:
        Allowing dynamic memory allocation
        Supporting efficient insertion and deletion

** Types of Linked Lists
1️] Singly Linked List

Each node points only to the next node in the list.
Head → Node1 → Node2 → Node3 → NULL

Features:
1.One-directional traversal
2.Requires less memory
3.Simple to implement

2️] Doubly Linked List

Each node contains two links: previous and next.

NULL ← Node1 ⇄ Node2 ⇄ Node3 → NULL

Features:
1.Bidirectional traversal
2.Easier deletion
3.Requires more memory

3️] Circular Linked List

The last node points back to the first node.
Node1 → Node2 → Node3
   ↑________________|

Features:
1.No NULL pointer
2.Continuous traversal
3.Efficient for round-robin applications

** Basic Operations on Linked List
1. Traversal

Visiting each node sequentially from head to last node.
Time Complexity: O(n)

2.Insertion

    At beginning
    At end
    At specific position

Time Complexity: O(1) or O(n) depending on position

3.Deletion

    From beginning
    From end
    From specific position

Time Complexity: O(1) or O(n)

4.Searching

Finding a particular element in the list.
Time Complexity: O(n)

** Time Complexity Summary
Operation	Time Complexity
 Access	        O(n)
 Search	        O(n)
 Insert	        O(1) / O(n)
 Delete	        O(1) / O(n)

** Advantages of Linked List

1.Dynamic size
2.Efficient insertions and deletions
3.Better memory utilization
4.No shifting of elements required

** Disadvantages of Linked List

1.No random access
2.Extra memory required for pointers
3.Traversal is slower compared to arrays

                    Linked List     vs     Array
Feature	                  Array	        Linked List
Memory Allocation	    Contiguous	    Non-contiguous
Size	                Fixed	           Dynamic
Access  Time	        O(1)	            O(n)
Insertion/Deletion	    Costly	        Efficient

Conclusion

A linked list is a flexible and efficient data structure used to store a collection of elements dynamically.
It overcomes the limitations of arrays and is widely used in applications such as memory management, implementation of stacks and queues, and dynamic data handling.


1]
Basic Node Syntax (Java)
class Node {
    int data;     // data part
    Node next;    // link part

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
HERE:
data -> stores value
next -> reference to next node
null -> indicates end of list

2]Declaring Head Node

Node head = null;

'head' stores address of first node
Empty list -> head = null

3]
Creating & Linking Nodes (Syntax)
Node n1 = new Node(10);
Node n2 = new Node(20);
Node n3 = new Node(30);

head = n1;
n1.next = n2;
n2.next = n3;


 */
public class a1_linkedList {
}
