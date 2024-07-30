package staticpackage;

public class MyClass {
    // 2 static variables
    static int staticVar1 = 10;
    static String staticVar2 = "Static Variable 2";

    // 2 instance variables
    int instanceVar1 = 20;
    String instanceVar2 = "Instance Variable 2";

    // 2 static methods
    public static void staticMethod1() {
        System.out.println("Static Method 1");
        // Print instance variables in static methods (not possible directly)
        // MyClass obj = new MyClass();
        // System.out.println(obj.instanceVar1);
        // System.out.println(obj.instanceVar2);
        
        // Call instance methods in static methods
        MyClass obj = new MyClass();
        obj.instanceMethod1();
    }

    public static void staticMethod2() {
        System.out.println("Static Method 2");
        // Print instance variables in static methods (not possible directly)
        // MyClass obj = new MyClass();
        // System.out.println(obj.instanceVar1);
        // System.out.println(obj.instanceVar2);
        
        // Call instance methods in static methods
        MyClass obj = new MyClass();
        obj.instanceMethod2();
    }

    // 2 instance methods
    public void instanceMethod1() {
        System.out.println("Instance Method 1");
        // Print static variables in Instance methods
        System.out.println(staticVar1);
        System.out.println(staticVar2);
        
        // Call static methods in instance methods
        //MyClass.staticMethod1();
    }

    public void instanceMethod2() {
        System.out.println("Instance Method 2");
        // Print static variables in Instance methods
        System.out.println(staticVar1);
        System.out.println(staticVar2);
        
        // Call static methods in instance methods
        //MyClass.staticMethod1();
    }

    // main method
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Print all the static, instance variables in main method
        System.out.println("Static Variables:");
        System.out.println(staticVar1);
        System.out.println(staticVar2);
        System.out.println("Instance Variables:");
        System.out.println(obj.instanceVar1);
        System.out.println(obj.instanceVar2);

        // Call static methods in main method
        staticMethod1();
        staticMethod2();

        // Call instance methods in main method
        obj.instanceMethod1();
        obj.instanceMethod2();

        // Call instance methods in static methods (not possible directly)
        // staticMethod1 calls instanceMethod1
        // staticMethod2 calls instanceMethod2
    }
}
/*
 * The code will cause a StackOverflowError because of infinite recursion.
 * In staticMethod1, we can create a new instance of MyClass and call instanceMethod1 on it. 
 * In instanceMethod1,I am calling staticMethod1 again, which creates a new instance of MyClass 
 * and calls instanceMethod1 on it, and so on.
 * This creates an infinite loop of method calls, which eventually causes a StackOverflowError.
 */
