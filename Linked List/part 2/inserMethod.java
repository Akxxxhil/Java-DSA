class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class insertLinked {
    Node head;
    Node tail;

    void insertatany(int val, int index) {
        Node temp = new Node(val);
        Node x = head;

        for (int i = 0; i < index - 1; i++) {
          x=x.next;
        }
        temp.next = x.next;
        x.next = temp;

    }
}

public class inserMethod {
    public static void main(String[] args) {

    }
}
