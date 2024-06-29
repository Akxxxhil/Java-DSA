import java.util.Stack;

public class insertatbootom {
    public static void main(String[] args) {
          Stack <Integer> st=new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(90);
        System.out.println("The st is " +st);
        Stack <Integer> grt=new Stack<>();
        grt.push(50);
        while(st.size() > 0){
            grt.push(st.pop());
        }
       
        System.out.println("The grtt is " +grt);
    }
}
