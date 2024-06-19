public class Try {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;

    // we need to enter the node (value) at teh end of linked list and print
    public static void insertAtENd(int data) {
        Node temp = head;
        
            if (head == null) {
                // List is empty, so set head and tail to the new node
                head = temp;
                tail = temp;
            } else {
                // List is not empty, so add the new node to the end and update tail
                tail.next = temp;
                tail = temp;
            }
        }
    }

