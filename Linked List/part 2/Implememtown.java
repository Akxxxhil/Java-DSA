class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class NodeList {
    Node head;
    Node tail;
    int size;

    void inseratEnd(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        }
       else{
        tail.next = temp;
       // temp.next = null;
        tail = temp;
       }
       size++;
    }
    void insertatBeginning(int val){
        Node temp=new Node (val);
        if (head == null) {
            head = tail = temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void insertatany(int val, int index) {
        if(index==0){
            insertatBeginning(val);
            return;
        }
        if(index==size){
            inseratEnd(val);
            return;
        }
        if(index > size){
            System.out.println("Inavlid Index");
            return;
        }
        Node temp = new Node(val);
        Node x = head;

        for (int i = 0; i < index - 1; i++) {
          x=x.next;
        }
        temp.next = x.next;
        x.next = temp;

    }

    void printing() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }

    }

}

public class Implememtown {
    public static void main(String[] args) {
        NodeList a1 = new NodeList();
        a1.inseratEnd(12);
        a1.inseratEnd(13);
        a1.inseratEnd(14);
        a1.inseratEnd(15);
        System.out.println(a1.size);
        a1.printing();
        System.out.println();
        a1.insertatBeginning(20);
        a1.insertatBeginning(21);
        a1.insertatBeginning(22);
        a1.printing();
        System.out.println();
        a1.insertatany(100,2);
        a1.printing();
    }
}
