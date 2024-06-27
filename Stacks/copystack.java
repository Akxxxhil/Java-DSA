import java.util.Stack;

public class copystack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(90);
        System.out.println("st stacks are :" + st);

        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0) {
            rt.push(st.pop());
        }
        System.out.println("rt stacks are :" + rt);
        Stack<Integer> grt = new Stack<>();
        while (rt.size() > 0) {
            grt.push(rt.pop());
        }
        System.out.println("grt stacks are :" + grt);

    }
}
