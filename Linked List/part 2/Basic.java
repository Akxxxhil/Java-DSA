class Node {
    int val;
    Node next;

    // paramatarized constructor
    Node(int val) {
        this.val = val;
    }

}

public class Basic {
    public static void main(String[] args) {
        Node n1 = new Node(12);
        Node n2 = new Node(13);
        Node n3 = new Node(14);
        Node n4 = new Node(15);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node temp = n1;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
}