package DSAweek6;
//lec30
//use the code form c1 file
//insert new node in linkedlist
//1-in end
//2-in middle
//3-as a first node


class NodeC2
{
    int data;
    NodeC2 next;

    NodeC2(int d)
    {
        data = d;
        next = null;
    }
}

public class c2_insertInLinkedList {
        public static void main(String[] args)
        {
        NodeC1 n1 = new NodeC1(1);
        NodeC1 n2 = new NodeC1(2);
        NodeC1 n3 = new NodeC1(3);

        n1.next = n2;
        n2.next = n3;

        //above all is given


        }
}


class Solution{
    Node insertAtEnd(NodeC1 n1, int x) {
        NodeC1 newNode = new NodeC1(x);
    }
}
