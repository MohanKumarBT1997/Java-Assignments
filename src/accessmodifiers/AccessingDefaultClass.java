package accessmodifiers;

public class AccessingDefaultClass {
 public static void main(String[] args) {
     DefaultAccessClass defaultAccessClass = new DefaultAccessClass();

     // Accessing default field
     System.out.println("Default field value: " + defaultAccessClass.defaultField);

     // Accessing default method
     defaultAccessClass.defaultMethod();
 }
}