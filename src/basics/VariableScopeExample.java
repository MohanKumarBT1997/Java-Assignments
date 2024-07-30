package basics;

public class VariableScopeExample {
    // Global variable
    int x = 10;

    public static void main(String[] args) {
        VariableScopeExample obj = new VariableScopeExample();

        // Local variable with the same name as the global variable
        int x = 20;
        System.out.println("Local variable x: " + x);

        obj.printGlobalVariable();
    }

    public void printGlobalVariable() {
        System.out.println("Global variable x: " + x);
    }
}
