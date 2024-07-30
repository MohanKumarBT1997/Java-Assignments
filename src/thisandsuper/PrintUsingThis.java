package thisandsuper;

public class PrintUsingThis {
    private int x;
    private String y;
    private boolean z;

    public PrintUsingThis() {
        x = 10;
        y = "Hello";
        z = true;
    }

    public void printFields() {
        System.out.println("x: " + this.x);
        System.out.println("y: " + this.y);
        System.out.println("z: " + this.z);
    }

    public static void main(String[] args) {
    	PrintUsingThis obj = new PrintUsingThis();
        obj.printFields();
    }
}
