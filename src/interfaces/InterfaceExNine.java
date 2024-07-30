package interfaces;

public interface InterfaceExNine {

    public static final String PUBLIC_FIELD = "Public Field";

  //  private static final String PRIVATE_FIELD = "Private Field";

    public void print();

    private void myPrivateMethod() {
        System.out.println("Private method");
    }

    default void myDefaultMethod() {
        System.out.println("Default method");
        myPrivateMethod();
    }
}
