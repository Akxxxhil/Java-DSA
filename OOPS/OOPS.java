public class OOPS {
    public static void main(String[] args) {
        PEN p1=new PEN();
        p1.setcolor("red");
        p1.settip(1);
        System.out.println(p1.tip);
    
    }
    }
    
    class PEN {
        String color;
        int tip;
    
        void setcolor(String newcolor) {
            color = newcolor;
        }
    
        void settip(int newtip) {
            tip = newtip;
        }
    
    }