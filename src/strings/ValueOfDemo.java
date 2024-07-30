package strings;

public class ValueOfDemo {
    public static void main(String[] args) {
    	
        int intValue = 123;
        String strInt = String.valueOf(intValue);
        System.out.println("int to String: " + strInt);

        long longValue = 1234567890L;
        String strLong = String.valueOf(longValue);
        System.out.println("long to String: " + strLong);

        float floatValue = 3.14f;
        String strFloat = String.valueOf(floatValue);
        System.out.println("float to String: " + strFloat);

        double doubleValue = 3.14159;
        String strDouble = String.valueOf(doubleValue);
        System.out.println("double to String: " + strDouble);

        boolean boolValue = true;
        String strBool = String.valueOf(boolValue);
        System.out.println("boolean to String: " + strBool);
    }
}
