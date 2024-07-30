package interfaces;

public interface InterfaceExEight{
    int x = 10;
    String y = "Hello";

    void method1();
    void method2(String param);
}

class MainClass implements InterfaceExEight {
    @Override
    public void method1() {
        System.out.println("Method 1 called");
    }

    @Override
    public void method2(String param) {
        System.out.println("Method 2 called with param: " + param);
    }

    public static void main(String[] args) {
    	MainClass obj = new MainClass();

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        obj.method1();
        obj.method2("World");
    }
}
