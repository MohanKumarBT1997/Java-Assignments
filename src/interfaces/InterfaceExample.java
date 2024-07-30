package interfaces;

interface Printable {
    void print();
}

class Document implements Printable {
    @Override
    public void print() {
        System.out.println("Printing a document...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
    }
}