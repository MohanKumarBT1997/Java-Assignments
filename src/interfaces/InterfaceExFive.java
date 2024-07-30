package interfaces;

interface Printer {
    void print();
}

interface Displayable {
    void print();
}

class Book implements Printer, Displayable {
    public void print() {
        System.out.println("Printing the book...");
    }
}

public class InterfaceExFive {
    public static void main(String[] args) {
        Book doc = new Book();
        doc.print(); 
    }
}
