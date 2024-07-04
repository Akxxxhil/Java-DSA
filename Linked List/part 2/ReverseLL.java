public class ReverseLL {
   public static class Node{
        int val;
        Node next;
        Node (int val){
            this.val=val;
        }
    }
    public static void display(Node a){
        if(a == null ){
            return;
        }
        System.out.print(a.val + " ");
        display(a.next);
    }
    // reversing Linked list
    public static void redisplay(Node a){
        if(a == null ){
            return;
        }
        redisplay(a.next);
        System.out.print(a.val + " ");
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        display(a);
        System.out.println();
        redisplay(a);
    }
}
