package DSAweek6;
//lec30

/*
1-singly linkedlist
        -uni direction traversal
        -every node points to next node only
        -last node points to null
        -Backward traversal not possible

        1 -> 2 -> 3 -> 4 -> 5

2-doubly linkedlist
        - NO null pointer
        -both direction traversal possible
        -Backward traversal possible
        -one Node has address of both, 'previous node' and 'next node'

        1 <=> 2 <=> 3 <=> 4 <=> 5

3-circular singly linkedlist
        - NO null pointer
        - uni directional
        -Backward traversal not possible
        - last node points to first(head) node address
        - next of Last --> first node

          1 -> 2 -> 3 -> 4 -> 5
          ^___________________|

4 - circular doubly linkedlist
        - No null pointer
        - Bi-Directional
        - Backward traversal possible
        - last node points first && first also points to last
        - every node points to its prev and next node

        1 <-> 2 <-> 3 <-> 4 <-> 5
        ^_______________________^

 */

import org.w3c.dom.DOMImplementation;

class DoublyLL{
    int data;
    DoublyLL next;
    DoublyLL prev;

    DoublyLL(int d)
    {
        data = d;
        next = null;
        prev = null;
    }
}
public class a2_typesOfLinkedList {

    public static void main(String[] args)
    {
        DoublyLL obj1 = new DoublyLL(20);
        DoublyLL obj2 = new DoublyLL(40);
        DoublyLL obj3 = new DoublyLL(80);

        obj1.next = obj2;

        obj2.prev = obj1;
        obj2.next = obj3;

        obj3.prev = obj2;
        obj3.next = null;

    }
}
