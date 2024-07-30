package accessmodifiers;

public class AccessingPublicClass {
 public static void main(String[] args) {
     PublicAccessClass publicAccessClass = new PublicAccessClass();

     // Accessing public field
     System.out.println("Public field value: " + publicAccessClass.publicField);

     // Accessing public method
     publicAccessClass.publicMethod();
 }
}