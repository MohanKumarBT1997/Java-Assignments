package exceptions;

import java.lang.reflect.Field;

public class NoSuchFieldExceptionExample {
    public static void main(String[] args) {
        try {
            Class<?> clazz = MyClass.class;
            Field field = clazz.getField("nonExistingField");
            System.out.println("Field found: " + field.getName());
        } catch (NoSuchFieldException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class MyClass {
    private int existingField;
}
