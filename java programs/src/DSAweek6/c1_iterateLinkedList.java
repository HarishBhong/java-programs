package DSAweek6;

//1)Make a linkedlist and insert some integers as their data.
//2)Print all the data in linked list
//3)Print total number of nodes in linkedList using traversal
class NodeC1{ //Node name is already to a class in this package. So we cannot create duplicate class with same name
    int data;
    NodeC1 next;

    NodeC1(int d){
        data = d;
        next = null;
    }

}

public class c1_iterateLinkedList {
    public static void main(String[] args)
    {
        NodeC1 n1 = new NodeC1(10);
        NodeC1 n2 = new NodeC1(20);
        NodeC1 n3 = new NodeC1(30);
        NodeC1 n4 = new NodeC1(40);
        NodeC1 n5 = new NodeC1(50);
        //Linking nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        //traverse linked list and print the data of each node
        NodeC1 temp = n1; //type of 'temp' is Node, bcoz it is storing 'node obj'(ie.n1,n2..etc) in it. for doing so it must be of the same type as obj

        while(  temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }

        //traverse linked list and count no of nodes
        NodeC1 tmp = n1;
        int count = 0;

        while(tmp != null)
        {
            count++;
            tmp = tmp.next;
        }

        System.out.println("Total nodes = "+ count);

    }
}
