package exceptions;

import java.lang.reflect.Method;

public class NoSuchMethodExceptionExample {
    public static void main(String[] args) {
        try {
            Class<?> clazz = MyClass.class;
            Method method = clazz.getMethod("nonExistingMethod", String.class);
            System.out.println("Method found: " + method.getName());
        } catch (NoSuchMethodException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class SampleClass {
    public void existingMethod(String arg) {
        System.out.println("Existing method called with arg: " + arg);
    }
}
