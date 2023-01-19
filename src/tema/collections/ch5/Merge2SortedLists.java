package tema.collections.ch5;

public class Merge2SortedLists {
    static class Node{
        int data;
        Node next;
    };

    static Node newNode(int key){
        Node t = new Node();
        t.data=key;
        t.next=null;
        return t;
    }

    static void printList( Node node){
        while(node != null){
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    static Node merge(Node n1, Node n2){
        if(n1==null){
            return n2;
        }
        if(n2==null){
            return n1;
        }

        if(n1.data<n2.data){
            n1.next=merge(n1.next, n2);
            return n1;
        }else{
            n2.next = merge(n1, n2.next);
            return n2;
        }

    }

    public static void main(String[] args) {
        Node l1 = newNode(1);
        l1.next = newNode(5);
        l1.next.next = newNode(6);

        Node l2 = newNode(2);
        l2.next = newNode(3);
        l2.next.next = newNode(4);

        printList(merge(l1, l2));

        Node l3 = newNode(1);
        l3.next = newNode(5);
        l3.next.next = newNode(6);
        l3.next.next.next = newNode(7);
        l3.next.next.next.next = newNode(8);
        l3.next.next.next.next.next = newNode(9);

        Node l4 = newNode(2);
        l4.next = newNode(3);
        l4.next.next = newNode(4);

        printList(merge(l3, l4));

    }
}
