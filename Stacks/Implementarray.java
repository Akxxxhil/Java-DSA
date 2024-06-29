public class Implementarray {
    public static class Stack{
        int arr[]=new int [5];
        int index=0;


        void push(int x){
            arr[index]=x;
            index++;
        }

        int peek(){
            if(arr.length == 0){
                System.out.println("Stack is Empty !");
                return -1;
            }
            int peekElement=arr[index-1];
            return peekElement;
        }

        int pop(){
            if(arr.length == 0){
                System.out.println("Stack is Empty !");
                return -1;
            }
            int top=arr[index-1];
            arr[index-1]=0;
            index--;
            return top;
        }
        void display(){
            if(arr.length == 0){
                System.out.println("Stack is Empty !");
            }
            for (int i=0;i<arr.length-1;i++){
               System.out.print(arr[i] + " ");
            }
        }

        boolean isEmpty(){
            if(arr.length == 0){
                return true;
            }
            return false;
        }
        int size(){
            return index;
        }



    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(9);
        System.out.println();
        st.display();
        st.push(10);
        System.out.println();
        st.display();
        st.push(20);
        System.out.println();
        st.display();
        st.push(89); // 9 10 20 89
        System.out.println();
        System.out.println(st.isEmpty());

        st.display();
        System.out.println();

         //89
        System.out.println(st.peek());

        st.pop();// 89
        st.display();
        // System.out.println();
        
    }
}
