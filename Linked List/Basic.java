public class Basic {
    public static class Node {
        int data;
        Node next;

        //constructor on Node
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        // step;=craete a new Node
        Node newNode=new Node(data);

        if(head==null){
            head=tail=newNode;
            return;
        }

        //step;=making th head point towards this new nodes next
        newNode.next=head;

        //step:= marking new node as head
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public static void main(String[] args) {
        //creation of new linked list
        Basic ll=new Basic();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);


    }
}