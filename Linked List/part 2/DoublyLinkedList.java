public class DoublyLinkedList {
    public static class DNode {
        int val;
        DNode next;
        DNode prev;

        DNode(int val) {
            this.val = val;
        }
    }

    public static void print(DNode head) {
        DNode temp = head;
        System.out.print(" All the nodes are ");
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void printreverseusingdouble(DNode tail) {
        DNode temp = tail;
        System.out.print(" All the reverse nodes are ");
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void printRandom(DNode node) {
        DNode temp = node;
        System.out.print("from random to tail :");
        while (temp.prev != null) {
            temp = temp.prev;
        }
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        DNode a = new DNode(1);
        DNode b = new DNode(2);
        DNode c = new DNode(3);
        DNode d = new DNode(4);
        DNode e = new DNode(5);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;

        print(a);
        printreverseusingdouble(e);
        printRandom(c);
    }
}
