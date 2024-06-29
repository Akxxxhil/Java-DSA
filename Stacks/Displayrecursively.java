import java.util.Stack;

public class Displayrecursively {

    public static void Displayrecursively(Stack <Integer>st){
        if(st.size()==0){
            return;
        }
        int top=st.pop();
        System.out.print(top +" ");
        Displayrecursively(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(90);
        Displayrecursively(st);
    }
}
