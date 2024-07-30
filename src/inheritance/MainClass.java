package inheritance;

class A {
 int a = 10;

 void methodA1() {
     System.out.println("Method A1");
 }

 void methodA2() {
     System.out.println("Method A2");
 }

 void overrideMethod() {
     System.out.println("Override method in A");
 }
}

class B extends A {
 int b = 20;

 void methodB1() {
     System.out.println("Method B1");
 }

 void methodB2() {
     System.out.println("Method B2");
 }

 @Override
 void overrideMethod() {
     System.out.println("Override method in B");
 }
}

class C extends B {
 int c = 30;

 void methodC1() {
     System.out.println("Method C1");
 }

 void methodC2() {
     System.out.println("Method C2");
 }

 @Override
 void overrideMethod() {
     System.out.println("Override method in C");
 }
}

public class MainClass {
 public static void main(String[] args) {
     A a = new A();
     B b = new B();
     C c = new C();

     System.out.println("Calling methods of A");
     a.methodA1();
     a.methodA2();
     a.overrideMethod();

     System.out.println("Calling methods of B");
     b.methodA1();
     b.methodA2();
     b.methodB1();
     b.methodB2();
     b.overrideMethod();

     System.out.println("Calling methods of C");
     c.methodA1();
     c.methodA2();
     c.methodB1();
     c.methodB2();
     c.methodC1();
     c.methodC2();
     c.overrideMethod();

     System.out.println("Runtime Polymorphism");
     A ab = b;
     A ac = c;

     ab.overrideMethod();
     ac.overrideMethod();

     System.out.println("Runtime Polymorphism with Data Members");
     A aRef = b;
     System.out.println("Value of aRef: " + aRef.a); 
     aRef = c;
     System.out.println("Value of aRef: " + aRef.a); 
     B bRef = c;
     System.out.println("Value of bRef: " + bRef.b); 
     System.out.println("Value of bRef: " + bRef.a); 
 }
}
