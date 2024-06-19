public class GetterSetter {
    public static void main(String[] args) {
        PEN2 p1 = new PEN2();
        // p1.color = "red";
        // p1.tip = 4;
        p1.setColor("red");
        p1.setTip(2);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }
}

class PEN2 {
    private String color;
    private int tip;

    public String getColor() {
        return this.color;
    }

    public int getTip() {
        return this.tip;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setTip(int newTip) {
        this.tip = newTip;
    }
}
